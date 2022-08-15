package com.dsi.atfollow.service.serviceImpl;

import com.dsi.atfollow.model.District;
import com.dsi.atfollow.repository.DistrictRepo;
import com.dsi.atfollow.service.DistrictService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    private DistrictRepo districtRepo;

    public DistrictServiceImpl(DistrictRepo DistrictRepo) {
        this.districtRepo = DistrictRepo;
    }

    @Override
    public List<District> getAll() {
        return this.districtRepo.findAll();
    }

    @Override
    public District getDistrictById(Integer id) {
        return this.districtRepo.findById(id).orElseThrow();
    }

    @Override
    public District insert(District district) {
        return this.districtRepo.save(district);
    }

    @Override
    public District update(Integer id, District district) {
        District currentDistrict = this.districtRepo.findById(id).orElseThrow();
        currentDistrict.setName(district.getName());
        return this.districtRepo.save(currentDistrict);
    }

    @Override
    public void delete(Integer id) {
        this.districtRepo.deleteById(id);
    }
}
