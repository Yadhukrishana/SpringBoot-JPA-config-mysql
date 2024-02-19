package Yadhu.ProjectOne;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class Student {  // 1:  create a pojo class name student, so that declare variables to insert in to your database

	@Id
	@SequenceGenerator(
			
			name="student_sequence",
			sequenceName="student_sequence",
			allocationSize=1
			)
	
	private int id;      // 2: declare variables
private	String name;
	private LocalDate dob;
	private String email;
	
	
	
	
	
	public Student() { //3: create an default constructor 
		super();
	}





	public Student(String name, LocalDate dob, String email) {  // 4: create an parameterized constructor without id 
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
	}





	public Student(int id, String name, LocalDate dob, String email) {  // 5: create an 
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}





	public int getId() {  //6: initialize getters and setters for accepting values
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public LocalDate getDob() {
		return dob;
	}





	public void setDob(LocalDate dob) {
		this.dob = dob;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	@Override
	public String toString() {// 7: make it to string to print it in the Sting format
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + "]";
	}
	

	
	
	
}
