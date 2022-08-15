package com.dsi.atfollow.controller;

import com.dsi.atfollow.model.PhysicalStatus;
import com.dsi.atfollow.service.PhysicalStatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/physical-status")
public class PhysicalStatusController {
    private PhysicalStatusService physicalStatusService;

    public PhysicalStatusController(PhysicalStatusService physicalStatusService) {
        this.physicalStatusService = physicalStatusService;
    }

    @GetMapping
    public ResponseEntity<List<PhysicalStatus>> getAll() {
        return new ResponseEntity<>(this.physicalStatusService.getAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhysicalStatus> getPhysicalStatusById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(this.physicalStatusService.getPhysicalStatusById(id), OK);
    }

    @DeleteMapping("/{id}")
    public void deletePhysicalStatusById(@PathVariable("id") Long id) {
        this.physicalStatusService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhysicalStatus> update(@PathVariable("id") Long id, @RequestBody PhysicalStatus physicalStatus) {
        return new ResponseEntity<>(this.physicalStatusService.update(id, physicalStatus), OK);
    }

    @PostMapping
    public ResponseEntity<PhysicalStatus> insert(@RequestBody PhysicalStatus physicalStatus) {
        return new ResponseEntity<>(this.physicalStatusService.insert(physicalStatus), OK);
    }

}
