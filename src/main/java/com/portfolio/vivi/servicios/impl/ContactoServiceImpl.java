package com.portfolio.vivi.servicios.impl;

import com.portfolio.vivi.modelo.Contacto;
import com.portfolio.vivi.repositorios.ContactoRepository;
import com.portfolio.vivi.servicios.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class ContactoServiceImpl implements ContactoService {
    @Autowired
    ContactoRepository contactoRepository;
    @Override
    public Contacto agregarContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @Override
    public Contacto actualizarContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @Override
    public Set<Contacto> obtenerContactos() {
        return new LinkedHashSet<>(contactoRepository.findAll());
    }

    @Override
    public Contacto obtenerContacto(Long contactoId) {
        return contactoRepository.findById(contactoId).get();
    }

    @Override
    public void eliminarContacto(Long contactoId) {
        Contacto contacto = new Contacto();
        contacto.setContactoId(contactoId);
        contactoRepository.delete(contacto);
    }
}
