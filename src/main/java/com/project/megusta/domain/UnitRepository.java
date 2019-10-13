package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UnitRepository extends CrudRepository<Unit, Long> {
    public List<Unit> findByName(String name);
}
