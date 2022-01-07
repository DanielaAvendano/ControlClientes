
package mx.com.gm_practicaUdemy.practicaUdemy.Repository;

import mx.com.gm_practicaUdemy.practicaUdemy.Entities.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author DA
 */
public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
