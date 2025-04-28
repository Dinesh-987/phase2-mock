package com.fmc.question2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.question2.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	 List<Student> findBySchoolId(Long id);
}
