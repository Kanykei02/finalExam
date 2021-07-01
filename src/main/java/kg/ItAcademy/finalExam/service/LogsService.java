package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Logs;
import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.model.LogsModel;
import kg.ItAcademy.finalExam.model.RegionModel;

import java.util.List;

public interface LogsService {
    Logs createLogs(LogsModel logsModel);
    List<Logs> getInfectedCitizenByDate(Region regionModel, String infectedDate);
    List<Logs> getVaccinatedCitizenByDate(Region regionModel, String vaccinatedDate);
}
