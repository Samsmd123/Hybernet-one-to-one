package com.studentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {

	
	@Autowired
	IStudentRepository studentRepository;
	
	public void setStudentService(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);		
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.save(student);		
	}

	@Override
	public Student getById(int studentId) {
		Optional<Student> optional=studentRepository.findById(studentId);
		if(optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}

	@Override
	public List<Student> getAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getByDepartment(String department) {
		
		return studentRepository.findStudByDept(department);
	}

	@Override
	public List<Student> getByCity(String city) {
		
		return studentRepository.findStudByCity(city);
	}

	@Override
	public List<Student> getByCityAndDepartment(String city, String Department) {
		// TODO Auto-generated method stub
		return studentRepository.findByCityDept(city, Department) ;
	}

	@Override
	public List<Student> getByCityState(String city, String state) {
		
		return studentRepository.findByCitystate(city, state);
	}

}
