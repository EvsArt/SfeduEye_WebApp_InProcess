package org.sfedueye.crudwebappsfedueye.web.data.repository;

import org.sfedueye.crudwebappsfedueye.web.data.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAllByAcceptedIsTrueOrderByPhotoDesc();
    List<Person> findAllByAcceptedIsTrueOrderByPhoto();
    List<Person> findAllByAcceptedIsFalse();
    boolean existsByEmail(String email);
    Person findByEmail(String email);
}
