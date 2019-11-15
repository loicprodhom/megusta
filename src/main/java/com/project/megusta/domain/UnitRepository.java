package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "units")
public interface UnitRepository extends CrudRepository<Unit, Long> {
    public List<Unit> findByName(String name);
}
