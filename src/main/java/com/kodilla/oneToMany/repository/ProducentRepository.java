package com.kodilla.oneToMany.repository;

import com.kodilla.oneToMany.model.Producent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducentRepository extends CrudRepository<Producent, Long> {
}