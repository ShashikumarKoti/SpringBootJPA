package com.skoti.learning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skoti.learning.entity.Course;
import com.skoti.learning.entity.Student;
import com.skoti.learning.repo.CourseRepo;
import com.skoti.learning.repo.StudRepo;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

	@Autowired
	private StudRepo studeRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Course> courseList = new ArrayList<>();
		Course course1 = new Course();
		course1.setCourseName("Angular");
		
		Course course2 = new Course();
		course2.setCourseName("SpringBoot");
		
		courseList.add(course1);
		courseList.add(course2);
		
		List<Student> studList = new ArrayList<>();
		Student stud1 = new Student();
		stud1.setStudName("shashi");
		stud1.setCourses(courseList);
		
		Student stud2 = new Student();
		stud2.setStudName("shwetha");
		stud2.setCourses(courseList);
		
		studList.add(stud1);
		studList.add(stud2);
		
		course1.setStudName(studList);
		course2.setStudName(studList);
		
		courseRepo.save(course1);
		courseRepo.save(course2);
		
		studeRepo.save(stud1);
		studeRepo.save(stud2);
		
	}

}
