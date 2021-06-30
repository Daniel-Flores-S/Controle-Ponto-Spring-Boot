package com.ControlePonto.ControlePonto.service;

import com.ControlePonto.ControlePonto.model.JornadaTrabalho;
import com.ControlePonto.ControlePonto.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JornadaService {
    private Repository repository;

    @Autowired
    public JornadaService(Repository repository) {
        this.repository = repository;
    }

    public JornadaTrabalho save(JornadaTrabalho jb) {
        return repository.save(jb);
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        return repository.findById(id);
    }

    public List<JornadaTrabalho> getAll() {
        return repository.findAll();
    }

    public JornadaTrabalho updateJb(JornadaTrabalho jb) {
        return repository.save(jb);
    }

    public void deleteJornada(Long id) {
        JornadaTrabalho room = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Room not found for this id:: "+ id));

        repository.delete(room);


    }



}
