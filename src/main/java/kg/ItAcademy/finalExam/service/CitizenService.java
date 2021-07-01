package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Citizen;
import kg.ItAcademy.finalExam.model.CitizenModel;

import java.util.List;

public interface CitizenService {
    Citizen save(Citizen citizen);
    Citizen save(CitizenModel citizenModel);
    Citizen getById(Long id);
    List<Citizen> getAllCitizen();
}
