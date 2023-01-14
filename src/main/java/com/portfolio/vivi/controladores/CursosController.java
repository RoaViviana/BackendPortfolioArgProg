package com.portfolio.vivi.controladores;

import com.portfolio.vivi.modelo.Cursos;
import com.portfolio.vivi.servicios.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursosController {
    @Autowired
    private CursosService cursosService;
    @CrossOrigin("https://portfolio-viviana-roa.web.app/#/")
    @PostMapping("/")
    public ResponseEntity<Cursos> guardarCurso(@RequestBody Cursos cursos){
        return ResponseEntity.ok(cursosService.agregarCursos(cursos));
    }
    @CrossOrigin("+")
    @PutMapping("/")
    public ResponseEntity<Cursos> actualizarCursos(@RequestBody Cursos cursos){
        return ResponseEntity.ok(cursosService.actualizarCursos(cursos));
    }
    @CrossOrigin("+")
    @GetMapping("/")
    public ResponseEntity<?> listarCursos(){
        return ResponseEntity.ok(cursosService.obtenerCursos());
    }
    @CrossOrigin("+")
    @GetMapping("/{cursosId}")
    public Cursos listarCursos(@PathVariable("cursosId") Long cursosId){
        return cursosService.obtenerCurso(cursosId);
    }
    @CrossOrigin("+")
    @DeleteMapping("/{cursosId}")
    public void eliminarCurso(@PathVariable("cursosId") Long cursosId){
       cursosService.eliminarCurso(cursosId);
    }
}
