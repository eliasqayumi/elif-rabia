package com.dsi.atfollow.repository;

import com.dsi.atfollow.model.PhysicalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalStatusRepo extends JpaRepository<PhysicalStatus,Long> {

}
