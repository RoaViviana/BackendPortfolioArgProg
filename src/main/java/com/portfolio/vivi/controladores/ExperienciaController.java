package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Experiencia;
import com.portfolio.vivi.servicios.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PostMapping("/")
    public ResponseEntity<Experiencia> guardarExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(experienciaService.agregarExperiencia(experiencia));
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PutMapping("/")
    public ResponseEntity<Experiencia> actualizarExperiencia(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(experienciaService.actualizarExperiencia(experiencia));
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @GetMapping("/")
    public ResponseEntity<?> listarExperiencias(){
        return ResponseEntity.ok(experienciaService.obtenerExperiencias());
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @GetMapping("/{experienciaId}")
    public Experiencia listarExperiencias(@PathVariable("experienciaId") Long experienciaId){
        return experienciaService.obtenerExperiencia(experienciaId);
    }
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @DeleteMapping("/{experienciaId}")
    public void eliminarExperiencia(@PathVariable("experienciaId") Long experienciaId){
        experienciaService.eliminarExperiencia(experienciaId);
    }
}
