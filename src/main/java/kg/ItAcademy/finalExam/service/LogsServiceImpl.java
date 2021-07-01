package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Citizen;
import kg.ItAcademy.finalExam.entity.Logs;
import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.entity.Vaccine;
import kg.ItAcademy.finalExam.model.LogsModel;
import kg.ItAcademy.finalExam.model.RegionModel;
import kg.ItAcademy.finalExam.repository.LogsRepository;
import kg.ItAcademy.finalExam.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LogsServiceImpl implements LogsService{

    @Autowired
    private LogsRepository logsRepository;

    @Autowired
    private CitizenService citizenService;

    @Autowired
    private VaccineService vaccineService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Logs createLogs(LogsModel logsModel) {
        Citizen citizen = citizenService.getById(logsModel.getInfected());
        Citizen citizen1 = citizenService.getById(logsModel.getVaccinated());
        Vaccine vaccine = vaccineService.getById(logsModel.getVaccine());

        Logs logs = Logs.builder()
                .infectedDate(logsModel.getInfectedDate())
                .vaccinatedDate(logsModel.getVaccinatedDate())
                .infected(citizen)
                .vaccinated(citizen1)
                .vaccine(vaccine)
                .build();

        return logsRepository.save(logs);
    }

    @Override
    public List<Logs> getInfectedCitizenByDate(Region regionModel, String infectedDate) {
        List<Logs> logsList = logsRepository.findAllByInfectedDateAndRegion(infectedDate, regionModel);
        return logsList;
    }

    @Override
    public List<Logs> getVaccinatedCitizenByDate(Region regionModel, String vaccinatedDate) {
        List<Logs> logsList = logsRepository.findAllByInfectedDateAndRegion(vaccinatedDate, regionModel);
        return logsList;
    }


}
