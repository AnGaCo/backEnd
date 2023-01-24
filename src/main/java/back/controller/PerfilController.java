
package back.controller;

import back.entity.MiPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import back.service.IPerfilService;

@RestController
@RequestMapping("/api/perfil")
@CrossOrigin(origins = "http://localhost:4200")
public class PerfilController {
    
    @Autowired
    private IPerfilService perfilServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void createProfile(@RequestBody MiPerfil pers){
        perfilServ.crearPerfil(pers);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit/{id}")
    public void editProfile(@PathVariable("id") int id, 
                           @RequestBody MiPerfil pers){
        MiPerfil nva = perfilServ.buscarPerfil(id);
        if(nva != null){
            nva.setNombre(pers.getNombre());
            nva.setApellido(pers.getApellido());
            nva.setProfesion(pers.getProfesion());
            nva.setResumen(pers.getResumen());
            nva.setFoto(pers.getFoto());
            nva.setEmail(pers.getEmail());
            nva.setDomicilio(pers.getDomicilio());
            nva.setTelefono(pers.getTelefono());
            nva.setLinkedin(pers.getLinkedin());
            nva.setGithub(pers.getGithub());
            nva.setTwitter(pers.getTwitter());
            nva.setFacebook(pers.getFacebook());
            
            perfilServ.editarPerfil(nva);
        }
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteProfile(@PathVariable("id") int id){
        perfilServ.borrarPerfil(id);
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public MiPerfil detail(@PathVariable("id") int id){
        return perfilServ.buscarPerfil(id);
    }
    
    @GetMapping("/showAll")
    @ResponseBody
    public List<MiPerfil> showProfiles(){
        return perfilServ.verPerfiles();
    }
}
