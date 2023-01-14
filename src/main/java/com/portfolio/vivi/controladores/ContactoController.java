package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Contacto;
import com.portfolio.vivi.modelo.Cursos;
import com.portfolio.vivi.servicios.ContactoService;
import com.portfolio.vivi.servicios.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
    @Autowired
    private ContactoService contactoService;
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PostMapping("/")
    public ResponseEntity<Contacto> guardarContacto(@RequestBody Contacto contacto){
        return ResponseEntity.ok(contactoService.agregarContacto(contacto));
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PutMapping("/")
    public ResponseEntity<Contacto> actualizarContacto(@RequestBody Contacto contacto){
        return ResponseEntity.ok(contactoService.actualizarContacto(contacto));
    }

    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @GetMapping("/")
    public ResponseEntity<?> listarContactos(){
        return ResponseEntity.ok(contactoService.obtenerContactos());
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @GetMapping("/{contactoId}")
    public Contacto listarContacto(@PathVariable("contactoId") Long contactoId){
        return contactoService.obtenerContacto(contactoId);
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @DeleteMapping("/{contactoId}")
    public void eliminarContacto(@PathVariable("contactoId") Long contactoId){
        contactoService.eliminarContacto(contactoId);
    }
}
