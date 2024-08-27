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
public class Admin extends Utilisateur {

    @ElementCollection
    private List<String> departement;

    @OneToMany
    private List<Utilisateur> listeEquipe;

    @OneToOne(mappedBy = "admin", cascade = CascadeType.ALL)
    private Rapport rapport;

    @OneToOne(mappedBy = "admin", cascade = CascadeType.ALL)
    private Societe societe;

}
