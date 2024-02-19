package Yadhu.ProjectOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //10: make this as the repository  by adding repository annotation 
public interface StudentRepo extends JpaRepository<Student, Integer>{ // 9:  Create an interface and extend the  
	                                                                    // jparepository so that the jpa funtiond=s will be invoked
	

}
