
package mx.com.gm_practicaUdemy.practicaUdemy.Repository;

import mx.com.gm_practicaUdemy.practicaUdemy.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DA
 */
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
