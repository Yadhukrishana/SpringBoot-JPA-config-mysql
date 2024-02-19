package Yadhu.ProjectOne;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(path="/get")
public class StudentControler {  // 8: create a controller class to control the data-flow
	
	
	private final StudentService studentservice ;
	
	@Autowired
	public StudentControler(StudentService studentservice) {
	
		
		this.studentservice=studentservice;
  	}
	@GetMapping
	public List<Student> GetStudent()
	{
		return  studentservice.GetStudent();
		
	}

}
