package com.ControlePonto.ControlePonto.repository;

import com.ControlePonto.ControlePonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<JornadaTrabalho, Long> {
}
