package com.portfolio.vivi.servicios.impl;

import com.portfolio.vivi.modelo.Cursos;
import com.portfolio.vivi.modelo.Habilidades;
import com.portfolio.vivi.repositorios.HabilidadesRepository;
import com.portfolio.vivi.servicios.HabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class HabilidadesServiceImpl implements HabilidadesService {
    @Autowired
    private HabilidadesRepository habilidadesRepository;
    @Override
    public Habilidades agregarHabilidades(Habilidades habilidades) {
        return habilidadesRepository.save(habilidades);
    }

    @Override
    public Habilidades actualizarHabilidades(Habilidades habilidades) {
        return habilidadesRepository.save(habilidades);
    }

    @Override
    public Set<Habilidades> obtenerHabilidades() {
        return new LinkedHashSet<>(habilidadesRepository.findAll());
    }

    @Override
    public Habilidades obtenerHabilidad(Long habilidadesId) {
        return habilidadesRepository.findById(habilidadesId).get();
    }

    @Override
    public void eliminarHabilidades(Long habilidadesId) {

    }
}
