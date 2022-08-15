package com.dsi.atfollow.service;

import com.dsi.atfollow.model.District;

import java.util.List;

public interface DistrictService {
    List<District> getAll();
    District getDistrictById(Integer id);
    District insert(District District);
    District update(Integer id,District District);
    void delete(Integer id);
}
