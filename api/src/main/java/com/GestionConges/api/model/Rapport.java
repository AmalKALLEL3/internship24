package com.GestionConges.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rapport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRapport;

    private String nomEmp;
    private int heureTravail;
    private int heureCongé;
    private int soldeCongé;

    @OneToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

}

