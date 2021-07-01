package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Vaccine;

import java.util.List;

public interface VaccineService {
    Vaccine save(Vaccine vaccine);
    Vaccine getById(Long id);
    List<Vaccine> getAllVaccine();
}
