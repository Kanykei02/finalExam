package kg.ItAcademy.finalExam.controller;

import kg.ItAcademy.finalExam.entity.Citizen;
import kg.ItAcademy.finalExam.model.CitizenModel;
import kg.ItAcademy.finalExam.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @PostMapping
    public Citizen create(@RequestBody CitizenModel citizenModel){
        return citizenService.save(citizenModel);
    }

    @GetMapping
    public List<Citizen> getAllCitizen(){
        return citizenService.getAllCitizen();
    }

    @GetMapping("/{citizenId}")
    public Citizen getById(@PathVariable Long citizenId){
        return citizenService.getById(citizenId);
    }
}
