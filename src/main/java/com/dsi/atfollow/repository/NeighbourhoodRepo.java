package com.dsi.atfollow.repository;

import com.dsi.atfollow.model.Neighbourhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighbourhoodRepo extends JpaRepository<Neighbourhood,Integer> {
}
//fn +shift+ f6 =refactor yane rename