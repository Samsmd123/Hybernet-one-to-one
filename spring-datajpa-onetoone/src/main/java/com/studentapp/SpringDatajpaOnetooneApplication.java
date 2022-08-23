package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication   implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}
	
	IStudentService studentService;
	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void run(String... args) throws Exception {
		Address address=new Address("Bangalore","Karantaka");
		Student student=new Student("cloud","ISE",address);
		studentService.addStudent(student);
		//studentService.getByDepartment("Chennai").forEach(System.out::println);
		//studentService.getByCity("Chennai").forEach(System.out::println);
		//studentService.getByCityAndDepartment("Chennai", "cse").forEach(System.out::println);
		//studentService.getByCityAndDepartment("Chennai", "cse").forEach(System.out::println);
		studentService.getByCity("Bangalore").forEach(System.out::println);
		studentService.getByDepartment("EEE").forEach(System.out::println);
		studentService.getByCityAndDepartment("Bangalore", "ISE").forEach(System.out::println);
		studentService.getByCityState("Bangalore", "Karantaka").forEach(System.out::println);
	}

	

}
