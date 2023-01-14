package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Estudios;
import com.portfolio.vivi.servicios.EstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudios")
public class EstudiosController {
    @Autowired
    private EstudiosService estudiosService;
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PostMapping("/")
    public ResponseEntity<Estudios> guardarEstudios(@RequestBody Estudios estudios){
        return ResponseEntity.ok(estudiosService.agregarEstudios(estudios));
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PutMapping("/")
    public ResponseEntity<Estudios> actualizarEstudios(@RequestBody Estudios estudios){
        return ResponseEntity.ok(estudiosService.actualizarEstudios(estudios));
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @GetMapping("/")
    public ResponseEntity<?> listarEstudios(){
        return ResponseEntity.ok(estudiosService.obtenerEstudios());
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @GetMapping("/{estudiosId}")
    public Estudios listarEstudios(@PathVariable("estudiosId") Long estudiosId){
        return estudiosService.obtenerEstudios(estudiosId);
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @DeleteMapping("/{estudiosId}")
    public void eliminarEstudios(@PathVariable("estudiosId") Long estudiosId){
        estudiosService.eliminarEstudio(estudiosId);
    }
}
