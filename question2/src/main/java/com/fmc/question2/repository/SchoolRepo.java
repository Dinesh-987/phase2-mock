package com.fmc.question2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.question2.entity.School;

public interface SchoolRepo extends JpaRepository<School, Long> {

}
