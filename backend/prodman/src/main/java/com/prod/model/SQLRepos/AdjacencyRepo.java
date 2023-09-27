package com.prod.model.SQLRepos;
import org.springframework.data.repository.CrudRepository;

import com.prod.view.SQLEntities.Adjacencies;
public interface AdjacencyRepo extends CrudRepository<Adjacencies,Long>{
    
}
