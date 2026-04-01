package com.webmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webmvc.entities.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
