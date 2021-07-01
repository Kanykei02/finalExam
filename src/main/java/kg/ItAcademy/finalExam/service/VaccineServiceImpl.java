package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Vaccine;
import kg.ItAcademy.finalExam.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements VaccineService{

    @Autowired
    private VaccineRepository vaccineRepository;

    @Override
    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }

    @Override
    public Vaccine getById(Long id) {
        return vaccineRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vaccine> getAllVaccine() {
        return vaccineRepository.findAll();
    }
}
