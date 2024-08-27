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
public class Societe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSociete;

    private String nomSociete;

    @OneToMany(mappedBy = "Societe", cascade = CascadeType.ALL)
    private List<Admin> admins;

}

