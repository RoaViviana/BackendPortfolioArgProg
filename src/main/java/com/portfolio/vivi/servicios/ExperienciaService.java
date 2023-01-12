package com.portfolio.vivi.servicios;

import com.portfolio.vivi.modelo.Experiencia;

import java.util.Set;

public interface ExperienciaService {
    Experiencia agregarExperiencia(Experiencia experiencia);
    Experiencia actualizarExperiencia(Experiencia experiencia);
    Set<Experiencia> obtenerExperiencias();
    Experiencia obtenerExperiencia(Long experienciaId);
    void eliminarExperiencia(Long experienciaId);
}
