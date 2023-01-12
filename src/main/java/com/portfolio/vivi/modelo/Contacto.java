package com.portfolio.vivi.modelo;
import javax.persistence.*;

@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactoId;

    private String contactoNombre;
    private String contactoApellido;
    private String contactoEmail;
    private String contactoComentarios;

    public Long getContactoId() {
        return contactoId;
    }

    public void setContactoId(Long contactoId) {
        this.contactoId = contactoId;
    }

    public String getContactoNombre() {
        return contactoNombre;
    }

    public void setContactoNombre(String contactoNombre) {
        this.contactoNombre = contactoNombre;
    }

    public String getContactoApellido() {
        return contactoApellido;
    }

    public void setContactoApellido(String contactoApellido) {
        this.contactoApellido = contactoApellido;
    }

    public String getContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(String contactoEmail) {
        this.contactoEmail = contactoEmail;
    }

    public String getContactoComentarios() {
        return contactoComentarios;
    }

    public void setContactoComentarios(String contactoComentarios) {
        this.contactoComentarios = contactoComentarios;
    }

    public Contacto() {
    }
}