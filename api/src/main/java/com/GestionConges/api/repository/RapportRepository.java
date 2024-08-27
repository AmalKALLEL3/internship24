package com.GestionConges.api.repository;

import com.GestionConges.api.model.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepository extends JpaRepository<Rapport, Long> {
}
