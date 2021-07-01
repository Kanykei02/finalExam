package kg.ItAcademy.finalExam.controller;

import kg.ItAcademy.finalExam.entity.Vaccine;
import kg.ItAcademy.finalExam.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaccine")
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;

    @PostMapping
    public Vaccine create(@RequestBody Vaccine vaccine){
        return vaccineService.save(vaccine);
    }

    @GetMapping
    public List<Vaccine> getAllVaccine(){
        return vaccineService.getAllVaccine();
    }

    @GetMapping("/{vaccineId}")
    public Vaccine getById(@PathVariable Long vaccineId){
        return vaccineService.getById(vaccineId);
    }
}
