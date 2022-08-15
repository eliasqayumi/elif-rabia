package com.dsi.atfollow.service.serviceImpl;

import com.dsi.atfollow.model.City;
import com.dsi.atfollow.repository.CityRepo;
import com.dsi.atfollow.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private CityRepo cityRepo;

    public CityServiceImpl(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }

    @Override
    public List<City> getAll() {
        return this.cityRepo.findAll();
    }

    @Override
    public City getCityById(Integer id) {
        return this.cityRepo.findById(id).orElseThrow();
    }

    @Override
    public City insert(City city) {
        return this.cityRepo.save(city);
    }

    @Override
    public City update(Integer id, City city) {
        City currentCity = this.cityRepo.findById(id).orElseThrow();
        currentCity.setName(city.getName());
        return this.cityRepo.save(currentCity);
    }

    @Override
    public void delete(Integer id) {
        this.cityRepo.deleteById(id);
    }
}
