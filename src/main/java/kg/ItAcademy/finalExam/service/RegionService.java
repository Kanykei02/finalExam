package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.model.RegionModel;

import java.util.List;

public interface RegionService {
    Region save(Region region);
    Region save(RegionModel regionModel);
    Region getById(Long id);
    List<Region> getAllRegions();
}
