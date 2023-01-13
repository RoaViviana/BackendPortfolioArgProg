package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Experiencia;
import com.portfolio.vivi.servicios.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins ="*")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;
    @PostMapping("/")
    public ResponseEntity<Experiencia> guardarExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(experienciaService.agregarExperiencia(experiencia));
    }
    @PutMapping("/")
    public ResponseEntity<Experiencia> actualizarExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(experienciaService.actualizarExperiencia(experiencia));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarExperiencias(){
        return ResponseEntity.ok(experienciaService.obtenerExperiencias());
    }
    @GetMapping("/{experienciaId}")
    public Experiencia listarExperiencias(@PathVariable("experienciaId") Long experienciaId){
        return experienciaService.obtenerExperiencia(experienciaId);
    }
    @DeleteMapping("/{experienciaId}")
    public void eliminarExperiencia(@PathVariable("experienciaId") Long experienciaId){
        experienciaService.eliminarExperiencia(experienciaId);
    }
}
