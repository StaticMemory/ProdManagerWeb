package com.prod.model.SQLRepos;

import org.springframework.data.repository.CrudRepository;

import com.prod.view.SQLEntities.Projects;

public interface ProjectRepo extends CrudRepository<Projects,Long> {
    
}
