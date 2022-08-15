package com.dsi.atfollow.service;

import com.dsi.atfollow.model.Neighbourhood;

import java.util.List;

public interface NeighbourhoodService {
    List<Neighbourhood> getAll();
    Neighbourhood getNeighbourhoodById(Integer id);
    Neighbourhood insert(Neighbourhood Neighbourhood);
    Neighbourhood update(Integer id,Neighbourhood Neighbourhood);
    void delete(Integer id);
}
