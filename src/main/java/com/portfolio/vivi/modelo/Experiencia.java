package com.portfolio.vivi.modelo;
import javax.persistence.*;

@Entity
@Table(name = "experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienciaId;
    private String puesto;
    private String empresa;
    private String descripcionExperiencia;
    private String fechas;

    public Long getExperienciaId() {
        return experienciaId;
    }

    public void setExperienciaId(Long experienciaId) {
        this.experienciaId = experienciaId;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }
    public Experiencia(){

    }
}
