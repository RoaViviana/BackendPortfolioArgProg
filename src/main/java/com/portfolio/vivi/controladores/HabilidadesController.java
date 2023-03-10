package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Habilidades;
import com.portfolio.vivi.servicios.HabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {

    @Autowired
   HabilidadesService habilidadesService;
    @CrossOrigin("*")
    @PostMapping("/")
    public ResponseEntity<Habilidades> guardarHabilidades(@RequestBody Habilidades habilidades){
        return ResponseEntity.ok(habilidadesService.agregarHabilidades(habilidades));
    }
    @CrossOrigin("*")
    @PutMapping("/")
    public ResponseEntity<Habilidades> actualizarHabilidades(@RequestBody Habilidades habilidades){
        return ResponseEntity.ok(habilidadesService.actualizarHabilidades(habilidades));
    }
    @CrossOrigin("*")
    @GetMapping("/")
    public ResponseEntity<?> listarHabilidades(){
        return ResponseEntity.ok(habilidadesService.obtenerHabilidades());
    }
    @CrossOrigin("*")
    @GetMapping("/{habilidadesId}")
    public Habilidades listarHabilidadporId(@PathVariable("habilidadesId") Long habilidadesId){
        return habilidadesService.obtenerHabilidad(habilidadesId);
    }
    @CrossOrigin("*")
    @DeleteMapping("/{habilidadesId}")
    public void eliminarHabilidades(@PathVariable("habilidadesId") Long habilidadesId){
        habilidadesService.eliminarHabilidades(habilidadesId);
    }
}
