package com.dsi.atfollow.repository;

import com.dsi.atfollow.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District,Integer> {
}
