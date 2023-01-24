package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Contacto;
import com.portfolio.vivi.servicios.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
    @Autowired
    private ContactoService contactoService;
    @CrossOrigin("*")
    @PostMapping("/")
    public ResponseEntity<Contacto> guardarContacto(@RequestBody Contacto contacto){
        return ResponseEntity.ok(contactoService.agregarContacto(contacto));
    }
}
