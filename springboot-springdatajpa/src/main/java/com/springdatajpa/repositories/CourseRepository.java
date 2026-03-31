package com.springdatajpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.entities.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course,String>{

}
