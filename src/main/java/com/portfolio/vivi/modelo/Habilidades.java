package com.portfolio.vivi.modelo;
import javax.persistence.*;
@Entity
@Table(name = "habilidades")
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long habilidadesId;

    private String Logo;
    private String habilidadesNombre;
    private String habilidadesCategoria;
    private String habilidadesStatus;

    public Long getHabilidadesId() {
        return habilidadesId;
    }

    public void setHabilidadesId(Long habilidadesId) {
        this.habilidadesId = habilidadesId;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getHabilidadesNombre() {
        return habilidadesNombre;
    }

    public void setHabilidadesNombre(String habilidadesNombre) {
        this.habilidadesNombre = habilidadesNombre;
    }

    public String getHabilidadesCategoria() {
        return habilidadesCategoria;
    }

    public void setHabilidadesCategoria(String habilidadesCategoria) {
        this.habilidadesCategoria = habilidadesCategoria;
    }

    public String getHabilidadesStatus() {
        return habilidadesStatus;
    }

    public void setHabilidadesStatus(String habilidadesStatus) {
        this.habilidadesStatus = habilidadesStatus;
    }
    public Habilidades() {
    }
}
