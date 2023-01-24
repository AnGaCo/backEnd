
package back.entity;

import javax.persistence.*;


@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTec;
    @Basic
    private String nombre;
    
    public Tecnologia(){
        
    }

    public Tecnologia(int idTec, String nombre) {
        this.idTec = idTec;
        this.nombre = nombre;
    }

    public int getIdTec() {
        return idTec;
    }

    public void setIdTec(int idTec) {
        this.idTec = idTec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
