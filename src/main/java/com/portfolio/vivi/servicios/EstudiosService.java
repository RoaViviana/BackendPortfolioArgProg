package com.portfolio.vivi.servicios;

import com.portfolio.vivi.modelo.Estudios;

import java.util.Set;

public interface EstudiosService {
    Estudios agregarEstudios(Estudios estudios);
    Estudios actualizarEstudios(Estudios estudios);
    Set<Estudios> obtenerEstudios();
    Estudios obtenerEstudios(Long estudiosId);
    void eliminarEstudio(Long estudiosId);
}
