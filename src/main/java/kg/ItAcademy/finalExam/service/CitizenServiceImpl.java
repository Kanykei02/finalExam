package kg.ItAcademy.finalExam.service;

import kg.ItAcademy.finalExam.entity.Citizen;
import kg.ItAcademy.finalExam.entity.Region;
import kg.ItAcademy.finalExam.model.CitizenModel;
import kg.ItAcademy.finalExam.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService{

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private RegionService regionService;

    @Override
    public Citizen save(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    @Override
    public Citizen save(CitizenModel citizenModel) {
        Region region = regionService.getById(citizenModel.getRegion());

        Citizen citizen = Citizen.builder()
                .fullName(citizenModel.getFullName())
                .region(region)
                .build();

        return citizenRepository.save(citizen);
    }

    @Override
    public Citizen getById(Long id) {
        return citizenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Citizen> getAllCitizen() {
        return null;
    }
}
