package com.dsi.atfollow.controller;

import com.dsi.atfollow.model.District;
import com.dsi.atfollow.service.DistrictService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/district")
public class DistrictController {
    private DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping
    public ResponseEntity<List<District>> getAll() {
        return new ResponseEntity<>(this.districtService.getAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<District> getDistrictById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(this.districtService.getDistrictById(id), OK);
    }

    @DeleteMapping("/{id}")
    public void deleteDistrictById(@PathVariable("id") Integer id) {
        this.districtService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<District> update(@PathVariable("id") Integer id, @RequestBody District district) {
        return new ResponseEntity<>(this.districtService.update(id, district), OK);
    }

    @PostMapping
    public ResponseEntity<District> insert(@RequestBody District district) {
        return new ResponseEntity<>(this.districtService.insert(district), OK);
    }

}
