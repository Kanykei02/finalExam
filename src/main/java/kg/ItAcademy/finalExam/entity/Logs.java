package kg.ItAcademy.finalExam.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "logs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "infected")
    private Citizen infected;

    @ManyToOne
    @JoinColumn(name = "vaccinated")
    private Citizen vaccinated;

    @Column(name = "infected_date")
    private String infectedDate;

    @Column(name = "vaccinated_date")
    private String vaccinatedDate;

    @ManyToOne
    @JoinColumn(name = "vaccine_id")
    private Vaccine vaccine;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
