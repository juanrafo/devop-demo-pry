package com.demo.web.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.web.demoweb.model.Medico;
import com.demo.web.demoweb.repository.MedicoRepo;
import com.demo.web.demoweb.service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepo medicoRepo;

    public List<Medico> obtenerMedicos() {
        return medicoRepo.obtenerMedicos();
    }
}
