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
    @CrossOrigin("+")
    @PostMapping("/")
    public ResponseEntity<Estudios> guardarEstudios(@RequestBody Estudios estudios){
        return ResponseEntity.ok(estudiosService.agregarEstudios(estudios));
    }
    @CrossOrigin("*")
    @PutMapping("/")
    public ResponseEntity<Estudios> actualizarEstudios(@RequestBody Estudios estudios){
        return ResponseEntity.ok(estudiosService.actualizarEstudios(estudios));
    }
    @CrossOrigin("*")
    @GetMapping("/")
    public ResponseEntity<?> listarEstudios(){
        return ResponseEntity.ok(estudiosService.obtenerEstudios());
    }
    @CrossOrigin("*")
    @GetMapping("/{estudiosId}")
    public Estudios listarEstudios(@PathVariable("estudiosId") Long estudiosId){
        return estudiosService.obtenerEstudios(estudiosId);
    }
    @CrossOrigin("*")
    @DeleteMapping("/{estudiosId}")
    public void eliminarEstudios(@PathVariable("estudiosId") Long estudiosId){
        estudiosService.eliminarEstudio(estudiosId);
    }
}
