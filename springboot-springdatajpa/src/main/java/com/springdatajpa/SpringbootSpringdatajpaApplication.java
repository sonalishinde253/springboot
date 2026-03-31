package com.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springdatajpa.entities.Course;
import com.springdatajpa.repositories.CourseRepository;

@SpringBootApplication
public class SpringbootSpringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootSpringdatajpaApplication.class, args);
		CourseRepository repo = context.getBean(CourseRepository.class);
		System.out.println(repo.getClass());
		//Insert Operation
//		Course c1 = new Course();
//		c1.setCourseId("FNT");
//		c1.setCourseName("Front End ");
//		c1.setCourseDuration("3 months");
//		c1.setCoursefees(10000);
//		repo.save(c1);
		
		//count() method
		System.out.println("Number of courses = "+repo.count());
		
		//select operation based on primary key
//		Course c = repo.findById("FSJ").get();
//		System.out.println(c);
		
		//select all records
//		Iterable<Course> ca = repo.findAll();
//		ca.forEach(c-> System.out.println(c));
		//method references
//		ca.forEach(System.out::println);
		
		//Uodate Operation
//		Course c = repo.findById("FSJ").get();
//		c.setCoursefees(35000);
//		repo.save(c);
		
		//Delete operation based on primary key
//		if(repo.existsById("UI"))
//			repo.deleteById("UI");
//		else
//			System.out.println("Course Id does not exist");
		
		//Delete All records
		repo.deleteAll();
	}

}
