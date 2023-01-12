package com.portfolio.vivi.servicios.impl;

import com.portfolio.vivi.modelo.Experiencia;
import com.portfolio.vivi.repositorios.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.vivi.servicios.ExperienciaService;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ExperienciaServiceImpl implements ExperienciaService {
    @Autowired
    private ExperienciaRepository experienciaRepository;
    @Override
    public Experiencia agregarExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public Experiencia actualizarExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public Set<Experiencia> obtenerExperiencias() {
        return new LinkedHashSet<>(experienciaRepository.findAll());
    }

    @Override
    public Experiencia obtenerExperiencia(Long experienciaId) {
        return experienciaRepository.findById(experienciaId).get();
    }

    @Override
    public void eliminarExperiencia(Long experienciaId) {
        Experiencia experiencia = new Experiencia();
        experiencia.setExperienciaId(experienciaId);
        experienciaRepository.delete(experiencia);
    }
}
