package com.dsi.atfollow.service;

import com.dsi.atfollow.model.PhysicalStatus;

import java.util.List;

public interface PhysicalStatusService {
    List<PhysicalStatus> getAll();
    PhysicalStatus getPhysicalStatusById(Long id);
    PhysicalStatus insert(PhysicalStatus physicalStatus);
    PhysicalStatus update(Long id,PhysicalStatus physicalStatus);
    void delete(Long id);
}
