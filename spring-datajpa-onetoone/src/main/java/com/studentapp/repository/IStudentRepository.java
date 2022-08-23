package com.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer>{ 
	//List<Student> findByDepartment(String deptartment);
	//List<Student> getByAddressCity(String city);
	//List<Student> findByAddressCityAndDepartment(String city,String deptartment);
	
	@Query("from Student s where s.department=?1")
	List<Student> findStudByDept(String department);
	
	@Query("from Student s inner join s.address a where city=?1")
	List<Student> findStudByCity(String  city);
	
	@Query("from Student s inner join s.address a where a.city=?1 and s.department=?2")
	List<Student> findByCityDept(String  city,String dept);
	
	@Query ("from Student s inner join s.address a where city=?1 and a.state=2")
	List<Student> findByCitystate(String  city,String state);

	
}
