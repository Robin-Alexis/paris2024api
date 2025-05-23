package bts.sio.api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "investissement")
public class Investissement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    @JsonBackReference
    private Entreprise entreprise;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
}
