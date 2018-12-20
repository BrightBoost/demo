package com.example.setrack.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DemoRepository extends CrudRepository<Demo, Long> {
    List<Demo> findAll();
    Demo findOne(long id);

}
