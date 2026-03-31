package com.springdatajpa;

import java.util.Arrays;
import java.util.List;

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
//		repo.deleteAll();
		
		//Adding multiple persistence object using saveAll()
//		Course c1 = new Course("FSP","Full Stack Python","5 months",50000);
//		Course c2 = new Course("NET","Full Stack .NET","6 months",50000);
//		Course c3 = new Course("C","C Language","2 months",10000);
//		Course c4 = new Course("C#","C# Language","5 months",50000);
//		Course c5 = new Course("DB","Database","5 months",50000);
//		List<Course> courses = Arrays.asList(c1,c2,c3,c4,c5);
//		repo.saveAll(courses);
		
		//Using findAllById()
//		List<String> courseIds = Arrays.asList("FSP","NET","C");
//		Iterable<Course> courses = 	repo.findAllById(courseIds);
//		courses.forEach(System.out::println);
		
		//findByXXX()
//		List<Course> courses = repo.findByCourseDuration("5 months");
//		courses.forEach(System.out::println);
		
//		List<Course> courses = repo.findByCoursefees(50000);
//		courses.forEach(System.out::println);
		
//		List<Course> courses = repo.findByCoursefeesIsLessThanEqual(20000);
//		courses.forEach(System.out::println);
		
		//Cutsom Queries
//		List<Course> courses = repo.getAllCourses();		
//		courses.forEach(System.out::println);
//		List<Course> courses = repo.getCourses();		
//		courses.forEach(System.out::println);
//		List<Course> courses = repo.getCourseFeeLessThanEqual(20000);		
//		courses.forEach(System.out::println);
		List<Course> courses = repo.getCourseFeeGreaterThanEqual(20000);		
		courses.forEach(System.out::println);
	}

}
