package com.portfolio.vivi.servicios.impl;

import com.portfolio.vivi.repositorios.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.vivi.servicios.ProyectosService;
import com.portfolio.vivi.modelo.Proyectos;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ProyectosServiceImpl implements ProyectosService {
    @Autowired
    ProyectosRepository proyectosRepository;
    @Override
    public Proyectos agregarProyectos(Proyectos proyectos) {
        return proyectosRepository.save(proyectos);
    }

    @Override
    public Proyectos actualizarProyectos(Proyectos proyecto) {
        return proyectosRepository.save(proyecto);
    }

    @Override
    public Set<Proyectos> obtenerProyectos() {
        return new LinkedHashSet<>(proyectosRepository.findAll());
    }

    @Override
    public Proyectos obtenerProyecto(Long proyectosId) {
        return proyectosRepository.findById(proyectosId).get();
    }

    @Override
    public void eliminarProyecto(Long proyectosId) {
        Proyectos proyectos = new Proyectos();
        proyectos.setProyectosId(proyectosId);
        proyectosRepository.delete(proyectos);

    }
}
