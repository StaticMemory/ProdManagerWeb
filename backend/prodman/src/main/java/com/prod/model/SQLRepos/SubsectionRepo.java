package com.prod.model.SQLRepos;

import org.springframework.data.repository.CrudRepository;

import com.prod.view.SQLEntities.Subsections;

public interface SubsectionRepo extends CrudRepository<Subsections,Long> {
    
}
