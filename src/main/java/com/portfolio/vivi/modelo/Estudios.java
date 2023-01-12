package com.portfolio.vivi.modelo;
import javax.persistence.*;

@Entity
@Table(name="estudios")
public class Estudios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudiosId;

    private String carrera;
    private String institucion;
    private String descripcionEstudios;
    private String fechas;

    public Long getEstudiosId() {
        return estudiosId;
    }

    public void setEstudiosId(Long estudiosId) {
        this.estudiosId = estudiosId;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDescripcionEstudios() {
        return descripcionEstudios;
    }

    public void setDescripcionEstudios(String descripcionEstudios) {
        this.descripcionEstudios = descripcionEstudios;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public Estudios() {
    }
}
