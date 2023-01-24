
package back.repository;

import back.entity.MiPerfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MiPerfilRepository extends JpaRepository <MiPerfil,Integer>{
    
}
