package Yadhu.ProjectOne;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class StudentService {// 9: create an service class for providing the service for student class

	
	private final StudentRepo studentRepo;
	@Autowired
	public StudentService(StudentRepo studentRepo) {
		
		this.studentRepo=studentRepo;
	}
	
	public List<Student> GetStudent()
	{
		return studentRepo.findAll();
		
	}
	
	
}
