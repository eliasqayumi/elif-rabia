package com.dsi.atfollow.controller;

import com.dsi.atfollow.model.Neighbourhood;
import com.dsi.atfollow.service.NeighbourhoodService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/neighbourhood")
public class NeighbourhoodController {
    private NeighbourhoodService neighbourhoodService;

    public NeighbourhoodController(NeighbourhoodService neighbourhoodService) {
        this.neighbourhoodService = neighbourhoodService;
    }

    @GetMapping
    public ResponseEntity<List<Neighbourhood>> getAll() {
        return new ResponseEntity<>(this.neighbourhoodService.getAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Neighbourhood> getNeighbourhoodById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(this.neighbourhoodService.getNeighbourhoodById(id), OK);
    }

    @DeleteMapping("/{id}")
    public void deleteNeighbourhoodById(@PathVariable("id") Integer id) {
        this.neighbourhoodService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Neighbourhood> update(@PathVariable("id") Integer id, @RequestBody Neighbourhood neighbourhood) {
        return new ResponseEntity<>(this.neighbourhoodService.update(id, neighbourhood), OK);
    }

    @PostMapping
    public ResponseEntity<Neighbourhood> insert(@RequestBody Neighbourhood neighbourhood) {
        return new ResponseEntity<>(this.neighbourhoodService.insert(neighbourhood), OK);
    }

}
