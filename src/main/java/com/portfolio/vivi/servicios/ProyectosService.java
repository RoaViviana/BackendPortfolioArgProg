package com.portfolio.vivi.servicios;

import com.portfolio.vivi.modelo.Proyectos;

import java.util.Set;

public interface ProyectosService {
    Proyectos agregarProyectos(Proyectos proyectos);
    Proyectos actualizarProyectos(Proyectos proyecto);
    Set<Proyectos> obtenerProyectos();
    Proyectos obtenerProyecto(Long proyectosId);
    void eliminarProyecto(Long proyectosId);
}
