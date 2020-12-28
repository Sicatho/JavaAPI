package com.github.java.spring.usman.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {


    @Query(value = "Select p from Person p where p.profession = :profession")
    Person findByProfession(@Param("profession") String profession);

}
