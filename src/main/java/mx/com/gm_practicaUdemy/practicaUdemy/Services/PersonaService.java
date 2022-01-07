
package mx.com.gm_practicaUdemy.practicaUdemy.Services;

import java.util.List;
import mx.com.gm_practicaUdemy.practicaUdemy.Entities.Persona;

/**
 *
 * @author DA
 */
public interface PersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
