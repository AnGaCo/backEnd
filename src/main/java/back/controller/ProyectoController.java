
package back.controller;

import back.entity.Proyecto;
import back.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proyecto")
@CrossOrigin(origins = {"https://manuelorozco-portfolio.web.app","http://localhost:4200"})
public class ProyectoController {
    
    @Autowired
    private IProyectoService proServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void createProject(@RequestBody Proyecto pro){
        proServ.agregarProyecto(pro);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit/{id}")
    public void editProject(@PathVariable("id") int id, 
                           @RequestBody Proyecto pro){
        Proyecto nvo = proServ.buscarProyecto(id);
        if(nvo != null){
            nvo.setNombre(pro.getNombre());
            nvo.setDescripcion(pro.getDescripcion());
            nvo.setImagen_demo(pro.getImagen_demo());
            nvo.setEnlace_proyecto(pro.getEnlace_proyecto());
            nvo.setFecha_realizacion(pro.getFecha_realizacion());
            
            proServ.editarProyecto(nvo);
        }
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable("id") int id){
        proServ.borrarProyecto(id);
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Proyecto detail(@PathVariable("id") int id){
        return proServ.buscarProyecto(id);
    }
    
    @GetMapping("/showAll")
    @ResponseBody
    public List<Proyecto> showProjects(){
        return proServ.verProyectos();
    }
}
