package kg.ItAcademy.finalExam.repository;

import kg.ItAcademy.finalExam.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
    List<Region> findAllByOrderByName (String name);
}
