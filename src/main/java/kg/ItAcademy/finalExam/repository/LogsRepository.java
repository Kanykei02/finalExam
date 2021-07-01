package kg.ItAcademy.finalExam.repository;

import kg.ItAcademy.finalExam.entity.Logs;
import kg.ItAcademy.finalExam.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Long> {
    List<Logs> findAllByInfectedDateAndRegion(String infectedDate, Region region);
    List<Logs> findAllByVaccinatedDateAndRegion(String vaccinatedDate, Region region);
    //List<Logs> findAllByRegion
}
