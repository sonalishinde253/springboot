package com.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.entities.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course,String>{
	public List<Course> findByCourseDuration(String duration);
	public List<Course> findByCoursefees(int fee);
	public List<Course> findByCoursefeesIsLessThanEqual(int fee);
	
	//Custome Queries
	@Query(value="select * from course_details",nativeQuery=true)
	public List<Course> getAllCourses();
	
	//HQL
	@Query("from Course")
	public List<Course> getCourses();
	
	@Query(value="select * from course_details where course_fees<= :fee",nativeQuery=true)
	public List<Course> getCourseFeeLessThanEqual(int fee);
	
	//HQL
	@Query("from Course where coursefees >= :fee")
	public List<Course> getCourseFeeGreaterThanEqual(int fee);
}
