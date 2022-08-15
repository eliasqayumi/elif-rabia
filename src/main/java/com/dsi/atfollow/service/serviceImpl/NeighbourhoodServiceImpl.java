package com.dsi.atfollow.service.serviceImpl;

import com.dsi.atfollow.model.Neighbourhood;
import com.dsi.atfollow.repository.NeighbourhoodRepo;
import com.dsi.atfollow.service.NeighbourhoodService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NeighbourhoodServiceImpl implements NeighbourhoodService {

    private NeighbourhoodRepo neighbourhoodRepo;

    public NeighbourhoodServiceImpl(NeighbourhoodRepo NeighbourhoodRepo) {
        this.neighbourhoodRepo = NeighbourhoodRepo;
    }

    @Override
    public List<Neighbourhood> getAll() {
        return this.neighbourhoodRepo.findAll();
    }

    @Override
    public Neighbourhood getNeighbourhoodById(Integer id) {
        return this.neighbourhoodRepo.findById(id).orElseThrow();
    }

    @Override
    public Neighbourhood insert(Neighbourhood Neighbourhood) {
        return this.neighbourhoodRepo.save(Neighbourhood);
    }

    @Override
    public Neighbourhood update(Integer id, Neighbourhood Neighbourhood) {
        Neighbourhood currentNeighbourhood = this.neighbourhoodRepo.findById(id).orElseThrow();
        currentNeighbourhood.setName(Neighbourhood.getName());
        return this.neighbourhoodRepo.save(currentNeighbourhood);
    }

    @Override
    public void delete(Integer id) {
        this.neighbourhoodRepo.deleteById(id);
    }
}
