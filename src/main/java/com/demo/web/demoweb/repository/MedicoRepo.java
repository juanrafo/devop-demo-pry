package com.demo.web.demoweb.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.web.demoweb.model.Medico;
@Repository
public class MedicoRepo {

    public List<Medico> obtenerMedicos() {
        return Arrays.asList(Medico.builder()
                .id(1)
                .codigo("1111")
                .nombre("pqr")
                .apellido("abc")
                .build());
    }
}
