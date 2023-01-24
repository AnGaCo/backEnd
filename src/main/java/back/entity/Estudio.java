
package back.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;


@Entity
public class Estudio {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idEstudio;
    @Basic
    private String institucion;
    private String logo;
    private String titulo;
    private LocalDate entrada;
    private LocalDate salida;
    
    public Estudio(){
        
    }

    public Estudio(int idEstudio, String nombre_institucion, String logo, String titulo, String entrada, String salida) {
        this.idEstudio = idEstudio;
        this.institucion = nombre_institucion;
        this.logo = logo;
        this.titulo = titulo;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaIn = LocalDate.parse(entrada,formatter);
        LocalDate fechaSal = LocalDate.parse(salida,formatter);
        
        this.entrada = fechaIn;
        this.salida = fechaSal;
    }

    public int getIdEstudio() {
        return idEstudio;
    }

    public void setIdEstudio(int idEstudio) {
        this.idEstudio = idEstudio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

}
