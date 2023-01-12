package com.portfolio.vivi.servicios;

import com.portfolio.vivi.modelo.Cursos;

import java.util.Set;

public interface CursosService {
    Cursos agregarCursos(Cursos cursos);
    Cursos actualizarCursos(Cursos cursos);
    Set<Cursos> obtenerCursos();
    Cursos obtenerCurso(Long cursosId);
    void eliminarCurso(Long cursosId);
}
