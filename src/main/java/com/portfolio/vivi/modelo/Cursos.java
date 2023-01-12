package com.portfolio.vivi.modelo;
import javax.persistence.*;

@Entity
@Table(name = "cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cursosId;

    private String nombreCurso;
    private String institucionCurso;
    private String descripcionCurso;
    private String estadoCurso;

    public Long getCursosId() {
        return cursosId;
    }

    public void setCursosId(Long cursosId) {
        this.cursosId = cursosId;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getInstitucionCurso() {
        return institucionCurso;
    }

    public void setInstitucionCurso(String institucionCurso) {
        this.institucionCurso = institucionCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public String getEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(String estadoCurso) {
        this.estadoCurso = estadoCurso;
    }

    public Cursos() {
    }
}