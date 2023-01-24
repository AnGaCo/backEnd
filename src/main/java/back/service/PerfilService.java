
package back.service;

import back.entity.MiPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import back.repository.MiPerfilRepository;

@Service
public class PerfilService implements IPerfilService{

    @Autowired
    public MiPerfilRepository perfilRepo;
    
    @Override
    public List<MiPerfil> verPerfiles() {
        return perfilRepo.findAll();
    }

    @Override
    public void crearPerfil(MiPerfil pers) {
        perfilRepo.save(pers);
    }

    @Override
    public void borrarPerfil(int id) {
        perfilRepo.deleteById(id);
    }

    @Override
    public MiPerfil buscarPerfil(int id) {
        return perfilRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPerfil(MiPerfil pers) {
        perfilRepo.save(pers);
    }
    
}
