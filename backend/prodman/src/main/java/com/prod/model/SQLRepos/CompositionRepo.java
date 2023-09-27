package com.prod.model.SQLRepos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prod.view.SQLEntities.Compositions;
import java.util.ArrayList;
public interface CompositionRepo extends CrudRepository<Compositions,Long>{
    @Query("SELECT u FROM Compositions u WHERE u.parentID = ?1")
    ArrayList<Compositions> getAllChildren(long id); //id of composition
}
