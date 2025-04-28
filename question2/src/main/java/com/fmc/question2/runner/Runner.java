package com.fmc.question2.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import com.fmc.question2.Question2Application;
import com.fmc.question2.entity.School;
import com.fmc.question2.entity.Student;
import com.fmc.question2.repository.SchoolRepo;
import com.fmc.question2.repository.StudentRepo;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
    private SchoolRepo schoolRepo;

    @Autowired
    private StudentRepo studentRepo;

    public static void main(String[] args) {
        SpringApplication.run(Question2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        School school = new School("Kesava Reddy Public School");

        Student s1 = new Student();
        s1.setName("sugreev");
        s1.setGrade("A");

        Student s2 = new Student();
        s2.setName("solomon");
        s2.setGrade("B");

        school.addStudent(s1);
        school.addStudent(s2);

        schoolRepo.save(school);
    }  
}
