package com.ayllusinchi.upeu.Services;

import com.ayllusinchi.upeu.entidades.PersonaTaller;
import com.ayllusinchi.upeu.entidades.Taller;
import java.util.List;

/**
 *
 * @author etham
 */
public interface PersonaTallerService {
    
    public List<PersonaTaller> findAll();
    public PersonaTaller findById(Long id);
    public List<PersonaTaller> findByTaller(Taller id);
    public PersonaTaller save (PersonaTaller personaTaller);
    public void delete(PersonaTaller personaTaller);
    public void deleteById(Long id);
    
}
