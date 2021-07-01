package kg.ItAcademy.finalExam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionModel {
    private String name;
    private Long population;
}
