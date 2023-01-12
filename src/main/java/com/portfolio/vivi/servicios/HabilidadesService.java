package com.portfolio.vivi.servicios;

import com.portfolio.vivi.modelo.Habilidades;

import java.util.Set;

public interface HabilidadesService {
    Habilidades agregarHabilidades(Habilidades habilidades);
    Habilidades actualizarHabilidades(Habilidades habilidades);
    Set<Habilidades> obtenerHabilidades();
    Habilidades obtenerHabilidad(Long habilidadesId);
    void eliminarHabilidades(Long habilidadesId);
}
