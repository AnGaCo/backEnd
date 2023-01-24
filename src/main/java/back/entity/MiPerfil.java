
package back.entity;

import java.util.List;
import javax.persistence.*;


@Entity
public class MiPerfil {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPerfil;
    @Basic
    private String nombre;
    private String apellido;
    private String profesion;
    private String resumen;
    private String foto;
    private String email;
    private String domicilio;
    private String telefono;
    private String linkedin;
    private String github;
    private String twitter;
    private String facebook;
    
    
    public MiPerfil(){
        super();
    }

    public MiPerfil(int idPerfil, String nombre, String apellido, String profesion, String resumen, String foto, String email, String domicilio, String telefono, String linkedin, String github, String twitter, String facebook) {
        this.idPerfil = idPerfil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.resumen = resumen;
        this.foto = foto;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.linkedin = linkedin;
        this.github = github;
        this.twitter = twitter;
        this.facebook = facebook;
    }
    
    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

}
