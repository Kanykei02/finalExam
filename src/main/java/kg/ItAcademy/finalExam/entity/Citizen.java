package kg.ItAcademy.finalExam.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "citizen")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "citizen_fullName", nullable = false)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;
}
