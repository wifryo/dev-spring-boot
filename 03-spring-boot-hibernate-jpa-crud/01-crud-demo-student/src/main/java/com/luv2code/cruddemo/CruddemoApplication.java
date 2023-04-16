package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			//createStudent(studentDAO);
			
			//createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Crud", "Nabbson", "crud@nabbson.plop");

		// save the student
		System.out.println("Saving student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student...");
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found student: " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("Jim", "Pap", "jim@pap.plop");
		Student tempStudent2 = new Student("Teb", "Pap", "teb@pap.plop");
		Student tempStudent3 = new Student("Bop", "Pap", "bop@pap.plop");

		// save the student objects
		System.out.println("Saving students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Arse", "Gleb", "arse@gleb.plop");

		// save the student object
		System.out.println("Saving student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated ID: " + tempStudent.getId());
	}

}
