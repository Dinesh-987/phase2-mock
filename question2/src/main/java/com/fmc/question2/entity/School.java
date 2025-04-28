package com.fmc.question2.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy="school",cascade=CascadeType.ALL,orphanRemoval = true)
	
	private Set<Student> students = new HashSet<>();
	
	public School(String name) {
		this.name=name;
	}
	public void addStudent(Student student) {
		students.add(student);
		student.setSchool(this);
	}
	public void removeStudent(Student student) {
		students.remove(student);
		student.setSchool(null);
	}
		
}
