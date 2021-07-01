package kg.ItAcademy.finalExam.controller;

import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.model.RegionModel;
import kg.ItAcademy.finalExam.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    @PostMapping
    public Region create(@RequestBody RegionModel regionModel){
        return regionService.save(regionModel);
    }

    @GetMapping
    public List<Region> getAllRegions(){
        return regionService.getAllRegions();
    }

    @GetMapping("/{regId}")
    public Region getById(@PathVariable Long regId){
        return regionService.getById(regId);
    }
}
