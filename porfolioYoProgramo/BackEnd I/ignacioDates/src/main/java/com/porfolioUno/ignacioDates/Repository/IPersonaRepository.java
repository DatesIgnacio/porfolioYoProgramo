
package com.porfolioUno.ignacioDates.Repository;

import com.porfolioUno.ignacioDates.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
