package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Proyectos;
import com.portfolio.vivi.servicios.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired
    private ProyectosService proyectosService;
    @CrossOrigin("*")
    @PostMapping("/")
    public ResponseEntity<Proyectos> guardarProyecto(@RequestBody Proyectos proyectos){
        return ResponseEntity.ok(proyectosService.agregarProyectos(proyectos));
    }
    @CrossOrigin("*")
    @PutMapping("/")
    public ResponseEntity<Proyectos> actualizarProyectos(@RequestBody Proyectos proyectos){
        return ResponseEntity.ok(proyectosService.actualizarProyectos(proyectos));
    }
    @CrossOrigin("*")
    @GetMapping("/")
    public ResponseEntity<?> listarProyectos(){
        return ResponseEntity.ok(proyectosService.obtenerProyectos());
    }
    @CrossOrigin("*")
    @GetMapping("/{proyectosId}")
    public Proyectos listarProyectos(@PathVariable("proyectosId") Long proyectosId){
        return proyectosService.obtenerProyecto(proyectosId);
    }
    @CrossOrigin("*")
    @DeleteMapping("/{proyectosId}")
    public void eliminarProyecto(@PathVariable("proyectosId") Long proyectosId){
        proyectosService.eliminarProyecto(proyectosId);
    }
}

