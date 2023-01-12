package com.portfolio.vivi.servicios.impl;

import com.portfolio.vivi.modelo.Cursos;
import com.portfolio.vivi.repositorios.CursosRepository;
import com.portfolio.vivi.servicios.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class CursosServiceImpl implements CursosService {
    @Autowired
    CursosRepository cursosRepository;
    @Override
    public Cursos agregarCursos(Cursos cursos) {
        return cursosRepository.save(cursos);
    }

    @Override
    public Cursos actualizarCursos(Cursos cursos) {
        return cursosRepository.save(cursos);
    }

    @Override
    public Set<Cursos> obtenerCursos() {
        return new LinkedHashSet<>(cursosRepository.findAll());
    }

    @Override
    public Cursos obtenerCurso(Long cursosId) {
        return cursosRepository.findById(cursosId).get();
    }

    @Override
    public void eliminarCurso(Long cursosId) {
        Cursos curso = new Cursos();
        curso.setCursosId(cursosId);
        cursosRepository.delete(curso);

    }
}
