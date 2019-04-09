package com.github.jander99.hibernatecacheapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "things", path = "things")
public interface ThingRepository extends JpaRepository<Thing, Long> {

    List<Thing> findByThing(@Param("thing") String thing);
}
