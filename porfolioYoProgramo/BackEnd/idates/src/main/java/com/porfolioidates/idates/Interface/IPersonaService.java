
package com.porfolioidates.idates.Interface;

import com.porfolioidates.idates.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void sevePersona(Persona persona);
    
    //eliminar objeto tipo Persona por ID
    public void deletePersona(Long id);
    
    //buscar persona por ID
    public Persona findPersona(Long id);

    public void savePersona(Persona persona);
    
    
    
}
