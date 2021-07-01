package kg.ItAcademy.finalExam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogsModel {
    private Long infected;
    private Long vaccinated;
    private String infectedDate;
    private String vaccinatedDate;
    private Long vaccine;
}
