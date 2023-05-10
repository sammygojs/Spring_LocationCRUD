package com.sammyGoJs.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.sammyGoJs.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
