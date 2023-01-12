package com.portfolio.vivi.servicios;

import com.portfolio.vivi.modelo.Contacto;

import java.util.Set;

public interface ContactoService {
    Contacto agregarContacto(Contacto contacto);
    Contacto actualizarContacto(Contacto contacto);
    Set<Contacto> obtenerContactos();
    Contacto obtenerContacto(Long contactoId);
    void eliminarContacto(Long contactoId);
}
