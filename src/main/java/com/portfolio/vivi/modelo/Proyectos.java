package com.portfolio.vivi.modelo;
import javax.persistence.*;

@Entity
@Table(name = "proyectos")
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proyectosId;

    private String proyectoTitulo;
    private String proyectoDescripcion;
    private String proyectoImagen;

    public Long getProyectosId() {
        return proyectosId;
    }

    public void setProyectosId(Long proyectosId) {
        this.proyectosId = proyectosId;
    }

    public String getProyectoTitulo() {
        return proyectoTitulo;
    }

    public void setProyectoTitulo(String proyectoTitulo) {
        this.proyectoTitulo = proyectoTitulo;
    }

    public String getProyectoDescripcion() {
        return proyectoDescripcion;
    }

    public void setProyectoDescripcion(String proyectoDescripcion) {
        this.proyectoDescripcion = proyectoDescripcion;
    }

    public String getProyectoImagen() {
        return proyectoImagen;
    }

    public void setProyectoImagen(String proyectoImagen) {
        this.proyectoImagen = proyectoImagen;
    }

    public Proyectos() {
    }
}
