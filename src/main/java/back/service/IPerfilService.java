
package back.service;

import back.entity.MiPerfil;
import java.util.List;


public interface IPerfilService {
    
    public List<MiPerfil> verPerfiles();
    public void crearPerfil(MiPerfil pers);
    public void borrarPerfil(int id);
    public MiPerfil buscarPerfil(int id);
    public void editarPerfil(MiPerfil pers);
}
