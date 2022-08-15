package com.dsi.atfollow.controller;

import com.dsi.atfollow.model.City;
import com.dsi.atfollow.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/city")
public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public ResponseEntity<List<City>> getAll() {
        return new ResponseEntity<>(this.cityService.getAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(this.cityService.getCityById(id), OK);
    }

    @DeleteMapping("/{id}")
    public void deleteCityById(@PathVariable("id") Integer id) {
        this.cityService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<City> update(@PathVariable("id") Integer id, @RequestBody City city) {
        return new ResponseEntity<>(this.cityService.update(id, city), OK);
    }

    @PostMapping
    public ResponseEntity<City> insert(@RequestBody City city) {
        return new ResponseEntity<>(this.cityService.insert(city), OK);
    }

}
