package com.dsi.atfollow.service;

import com.dsi.atfollow.model.City;

import java.util.List;

public interface CityService {
    List<City> getAll();
    City getCityById(Integer id);
    City insert(City city);
    City update(Integer id,City city);
    void delete(Integer id);
}
