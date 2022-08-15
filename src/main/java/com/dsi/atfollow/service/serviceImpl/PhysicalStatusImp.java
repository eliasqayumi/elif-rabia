package com.dsi.atfollow.service.serviceImpl;

import com.dsi.atfollow.model.PhysicalStatus;
import com.dsi.atfollow.repository.PhysicalStatusRepo;
import com.dsi.atfollow.service.PhysicalStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalStatusImp implements PhysicalStatusService {
    private PhysicalStatusRepo physicalStatusRepo;

    public PhysicalStatusImp(PhysicalStatusRepo physicalStatusRepo) {
        this.physicalStatusRepo = physicalStatusRepo;
    }

    @Override
    public List<PhysicalStatus> getAll() {
        return this.physicalStatusRepo.findAll();
    }

    @Override
    public PhysicalStatus getPhysicalStatusById(Long id) {
        return this.physicalStatusRepo.findById(id).orElseThrow();
    }

    @Override
    public PhysicalStatus insert(PhysicalStatus PhysicalStatus) {
        return this.physicalStatusRepo.save(PhysicalStatus);
    }

    @Override
    public PhysicalStatus update(Long id, PhysicalStatus newPhysicalStatus) {
        PhysicalStatus currentPhysicalStatus = this.physicalStatusRepo.findById(id).orElseThrow();

        currentPhysicalStatus.setProjectName(newPhysicalStatus.getProjectName());
        currentPhysicalStatus.setProjectNameWithCode(newPhysicalStatus.getProjectNameWithCode());
        currentPhysicalStatus.setProjectCode(newPhysicalStatus.getProjectCode());

        currentPhysicalStatus.setNeighbourhood(newPhysicalStatus.getNeighbourhood());
        currentPhysicalStatus.setRegistrationDate(newPhysicalStatus.getRegistrationDate());
        currentPhysicalStatus.setNumberOfHangersMade(newPhysicalStatus.getNumberOfHangersMade());

        currentPhysicalStatus.setNumberOfCadastreParcels(newPhysicalStatus.getNumberOfCadastreParcels());
        currentPhysicalStatus.setNumberOfNewPlots(newPhysicalStatus.getNumberOfNewPlots());
        currentPhysicalStatus.setNumberOfBusiness(newPhysicalStatus.getNumberOfBusiness());

        currentPhysicalStatus.setArea(newPhysicalStatus.getArea());
        currentPhysicalStatus.setPlannedPath(newPhysicalStatus.getPlannedPath());
        currentPhysicalStatus.setPath(newPhysicalStatus.getPath());

        currentPhysicalStatus.setPlannedStabilized(newPhysicalStatus.getPlannedStabilized());
        currentPhysicalStatus.setStabilized(newPhysicalStatus.getStabilized());
        currentPhysicalStatus.setRegistration(newPhysicalStatus.getRegistration());

        currentPhysicalStatus.setWagesNumber(newPhysicalStatus.getWagesNumber());
        currentPhysicalStatus.setPlannedDrainage(newPhysicalStatus.getPlannedDrainage());
        currentPhysicalStatus.setDrainage(newPhysicalStatus.getDrainage());

        currentPhysicalStatus.setPlannedStoneCollection(newPhysicalStatus.getPlannedStoneCollection());
        currentPhysicalStatus.setStoneCollection(newPhysicalStatus.getStoneCollection());
        currentPhysicalStatus.setPlannedLevelling(newPhysicalStatus.getPlannedLevelling());

        currentPhysicalStatus.setLevelling(newPhysicalStatus.getLevelling());
        currentPhysicalStatus.setAggregationRate(newPhysicalStatus.getAggregationRate());
        currentPhysicalStatus.setEnterpriseNumberOfPlotsOld(newPhysicalStatus.getEnterpriseNumberOfPlotsOld());

        currentPhysicalStatus.setNumberOfBusinessPlotsNew(newPhysicalStatus.getNumberOfBusinessPlotsNew());
        currentPhysicalStatus.setOldORTParcelFaceSize(newPhysicalStatus.getOldORTParcelFaceSize());
        currentPhysicalStatus.setAvgNewParcelFaceSize(newPhysicalStatus.getAvgNewParcelFaceSize());

        currentPhysicalStatus.setOKPRate(newPhysicalStatus.getOKPRate());
        return this.physicalStatusRepo.save(currentPhysicalStatus);
    }

    @Override
    public void delete(Long id) {
        this.physicalStatusRepo.deleteById(id);
    }
}
