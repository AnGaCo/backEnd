
package back.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;


@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idExp;
    @Basic
    private String puesto;
    private String lugar;
    private String logo_empresa;
    private LocalDate inicio;
    private LocalDate fin;
    private String descripcion;
    
    public Experiencia(){
        
    }

    public Experiencia(int idExp, String puesto, String lugar, String logo_empresa, String inicio, String fin, String descripcion) {
        this.idExp = idExp;
        this.puesto = puesto;
        this.lugar = lugar;
        this.logo_empresa = logo_empresa;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaInicio = LocalDate.parse(inicio,formatter);
        LocalDate fechaFin = LocalDate.parse(fin,formatter);
        
        this.inicio = fechaInicio;
        this.fin = fechaFin;
        this.descripcion = descripcion;
    }

    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLogo_empresa() {
        return logo_empresa;
    }

    public void setLogo_empresa(String logo_empresa) {
        this.logo_empresa = logo_empresa;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
