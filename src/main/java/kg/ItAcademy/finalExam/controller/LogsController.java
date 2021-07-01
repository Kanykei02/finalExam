package kg.ItAcademy.finalExam.controller;

import kg.ItAcademy.finalExam.entity.Logs;
import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.model.LogsModel;
import kg.ItAcademy.finalExam.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogsController {
    @Autowired
    private LogsService logsService;

    @PostMapping
    public Logs createLogs(@RequestBody LogsModel logsModel){
        return logsService.createLogs(logsModel);
    }

    @GetMapping()
    public List<Logs> getInfectedLogs(@PathVariable Region regionModel, String infectedDate){
        return logsService.getInfectedCitizenByDate(regionModel, infectedDate);
    }

    @GetMapping List<Logs> getVaccinatedLogs(@PathVariable Region regionModel, String vaccinatedDate){
        return logsService.getVaccinatedCitizenByDate(regionModel, vaccinatedDate);
    }
}
