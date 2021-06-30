package com.ControlePonto.ControlePonto.controller;

import com.ControlePonto.ControlePonto.model.JornadaTrabalho;
import com.ControlePonto.ControlePonto.repository.Repository;
import com.ControlePonto.ControlePonto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/jornada")
public class JornadaController {
    @Autowired
    private JornadaService jornadaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JornadaTrabalho createJornadaTrabalho(@RequestBody JornadaTrabalho jb) {
        return jornadaService.save(jb);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public JornadaTrabalho getJornada(@PathVariable("id") Long id) {
        return jornadaService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found!"));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<JornadaTrabalho> getAllJornadas() {
        return jornadaService.getAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jb) {
        return jornadaService.save(jb);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        jornadaService.deleteJornada(id);

    }
}
