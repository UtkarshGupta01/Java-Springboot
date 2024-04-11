package com.tutorial.cruddemo;

import com.tutorial.cruddemo.dao.StudentDAO;
import com.tutorial.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
			//createStudent(studentDAO);

			//createMultipleStudents(studentDAO);

			//findStudent(studentDAO);

			//queryForStudents(studentDAO);

			//queryForStudentsLastName(studentDAO);

			updateStudent(studentDAO);

		};
	}

	private void updateStudent(StudentDAO studentDAO) {

		//find Student
		System.out.println("Finding the Student...");
		int setPrimaryKey = 1;
		Student myStudent = studentDAO.findById(setPrimaryKey);

		//Set last name
		System.out.println("setting last name... ");
		myStudent.setLastName("Gupta");

		//Update Student
		studentDAO.update(myStudent);

		//display updated Student
		System.out.println("Updated Student : " + myStudent);

	}

	private void queryForStudentsLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastNAme("Shrivastava");

		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//retrieve data
		List<Student> theStudents = studentDAO.findAll();

		//display Data
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}

	}

	private void findStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Pritish","Singh","pritishsingh26@gmail.com");

		System.out.println("Saving the studnt...");
		studentDAO.save(tempStudent);

		int id = tempStudent.getId();
		System.out.println("Student saved . Generated Id : "+ id);

		//Retrieve student by id
		System.out.println("Finding student with genreated Id : ");
		Student myStudent = studentDAO.findById(id);

		//display student
		System.out.println("Found the student : "+myStudent);


	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 3 Student objects...");
		Student tempStudent1 = new Student("Sneha","Shrivastava","snehawish2@gmail.com");
		Student tempStudent2 = new Student("Utkarsh","Gupta","ug53054@gmail.com");
		Student tempStudent3 = new Student("Tanya","Rathore","tanrath1111@gmail.com");

		System.out.println("Saving the studnt...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		System.out.println("3 Students saved with  Id : "+ tempStudent1.getId()+", "+tempStudent2.getId()+", "+tempStudent3.getId());

	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Utkarsh","Gupta","ug53054@gmail.com");

		System.out.println("Saving the studnt...");
		studentDAO.save(tempStudent);

		System.out.println("Student saved . Generated Id : "+ tempStudent.getId());
	}


}
