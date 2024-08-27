package com.GestionConges.api.repository;

import com.GestionConges.api.model.Conge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CongeRepository extends JpaRepository<Conge, Long> {
}
