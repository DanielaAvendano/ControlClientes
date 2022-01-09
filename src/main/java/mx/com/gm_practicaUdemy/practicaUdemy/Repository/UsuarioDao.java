
package mx.com.gm_practicaUdemy.practicaUdemy.Repository;

import mx.com.gm_practicaUdemy.practicaUdemy.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DA
 */
public interface UsuarioDao extends JpaRepository<Usuario,Long>{
    Usuario findByUsername(String username);
}
