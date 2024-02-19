package Yadhu.ProjectOne;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class StudentCongfig {
	
	@Bean
	CommandLineRunner commandLinRunner(StudentRepo repository) {
		
		return args ->{
			Student  yadhu =new Student(5,"yadhu",LocalDate.of(2024,1,6),"kghjkbhjk");
		
		
			repository.saveAll(List.of(yadhu));
			};
	

	}

}
