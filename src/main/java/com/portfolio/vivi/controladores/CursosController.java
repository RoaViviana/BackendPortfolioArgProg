package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Cursos;
import com.portfolio.vivi.servicios.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
@CrossOrigin("https://portfolio-viviana-roa.web.app")
public class CursosController {
    @Autowired
    private CursosService cursosService;
    @PostMapping("/")
    public ResponseEntity<Cursos> guardarCurso(@RequestBody Cursos cursos){
        return ResponseEntity.ok(cursosService.agregarCursos(cursos));
    }
    @PutMapping("/")
    public ResponseEntity<Cursos> actualizarCursos(@RequestBody Cursos cursos){
        return ResponseEntity.ok(cursosService.actualizarCursos(cursos));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarCursos(){
        return ResponseEntity.ok(cursosService.obtenerCursos());
    }
    @GetMapping("/{cursosId}")
    public Cursos listarCursos(@PathVariable("cursosId") Long cursosId){
        return cursosService.obtenerCurso(cursosId);
    }
    @DeleteMapping("/{cursosId}")
    public void eliminarCurso(@PathVariable("cursosId") Long cursosId){
       cursosService.eliminarCurso(cursosId);
    }
}
