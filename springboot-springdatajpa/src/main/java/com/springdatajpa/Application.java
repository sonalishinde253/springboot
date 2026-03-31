package com.springdatajpa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.springdatajpa.entities.Employee;
import com.springdatajpa.repositories.EmployeeRepository;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository repo= context.getBean(EmployeeRepository.class);
		/*Employee e1 = new Employee(101,"Sonali","HR",50000);
		Employee e2 = new Employee(102,"Sakshi","Tester",60000);
		Employee e3 = new Employee(103,"Samar","HR",40000);
		Employee e4 = new Employee(104,"Aniket","Developer",30000);
		Employee e5 = new Employee(105,"Anjali","Tester",80000);
		Employee e6 = new Employee(106,"Amey","Analyst",90000);
		Employee e7 = new Employee(107,"Anupam","HR",55000);
		Employee e8 = new Employee(108,"Raghav","Developer",60000);
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		repo.saveAll(employees);*/
		
		//Pagination
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the page number");
//		int pageNum = sc.nextInt();
//		int pageSize = 3;
//		//page number will start from 0
//		PageRequest pageRequest = PageRequest.of(pageNum-1, pageSize);
//		Page<Employee> pages = repo.findAll(pageRequest);
//		List<Employee> employees = pages.getContent();
//		employees.forEach(System.out::println);
		
		//Sorting -- ascending sort(default)
//		List<Employee> employees = repo.findAll(Sort.by("empName"));
//		employees.forEach(System.out::println);
		//Descending order
//		List<Employee> employees = repo.findAll(Sort.by("empName").descending());
//		employees.forEach(System.out::println);
		List<Employee> employees = repo.findAll(Sort.by("empSalary"));
		employees.forEach(System.out::println);
	}

}
