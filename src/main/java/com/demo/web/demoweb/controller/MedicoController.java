package com.demo.web.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.web.demoweb.model.Medico;
import com.demo.web.demoweb.service.MedicoService;

@RestController
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/medicos")
    public ResponseEntity<List<Medico>> obtenerMedicos() {
        return new ResponseEntity(medicoService.obtenerMedicos(), HttpStatus.OK);
    }
}
