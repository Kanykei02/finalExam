package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Citizen;
import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.model.RegionModel;
import kg.ItAcademy.finalExam.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private CitizenService citizenService;

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region save(RegionModel regionModel) {
        Citizen citizen = citizenService.getById(regionModel.getPopulation());

        Region region = Region.builder()
                .name(regionModel.getName())
                .population(citizen)
                .build();

        return regionRepository.save(region);
    }

    @Override
    public Region getById(Long id) {
        return regionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }
}
