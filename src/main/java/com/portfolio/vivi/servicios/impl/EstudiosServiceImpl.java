package com.portfolio.vivi.servicios.impl;

import com.portfolio.vivi.modelo.Estudios;
import com.portfolio.vivi.repositorios.EstudiosRepository;
import com.portfolio.vivi.servicios.EstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class EstudiosServiceImpl implements EstudiosService {
    @Autowired
    private EstudiosRepository estudiosRepository;
    @Override
    public Estudios agregarEstudios(Estudios estudios) {
        return estudiosRepository.save(estudios);
    }

    @Override
    public Estudios actualizarEstudios(Estudios estudios) {
        return estudiosRepository.save(estudios);
    }

    @Override
    public Set<Estudios> obtenerEstudios() {
        return new LinkedHashSet<>(estudiosRepository.findAll());
    }

    @Override
    public Estudios obtenerEstudios(Long estudiosId) {
        return estudiosRepository.findById(estudiosId).get();
    }

    @Override
    public void eliminarEstudio(Long estudiosId) {
        Estudios estudios = new Estudios();
        estudios.setEstudiosId(estudiosId);
        estudiosRepository.delete(estudios);
    }
}
