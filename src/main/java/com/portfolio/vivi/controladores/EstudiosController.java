package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Estudios;
import com.portfolio.vivi.servicios.EstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudios")
@CrossOrigin(origins ="*")
public class EstudiosController {
    @Autowired
    private EstudiosService estudiosService;
    @PostMapping("/")
    public ResponseEntity<Estudios> guardarEstudios(@RequestBody Estudios estudios){
        return ResponseEntity.ok(estudiosService.agregarEstudios(estudios));
    }
    @PutMapping("/")
    public ResponseEntity<Estudios> actualizarEstudios(@RequestBody Estudios estudios){
        return ResponseEntity.ok(estudiosService.actualizarEstudios(estudios));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarEstudios(){
        return ResponseEntity.ok(estudiosService.obtenerEstudios());
    }
    @GetMapping("/{estudiosId}")
    public Estudios listarEstudios(@PathVariable("estudiosId") Long estudiosId){
        return estudiosService.obtenerEstudios(estudiosId);
    }
    @DeleteMapping("/{estudiosId}")
    public void eliminarEstudios(@PathVariable("estudiosId") Long estudiosId){
        estudiosService.eliminarEstudio(estudiosId);
    }
}
