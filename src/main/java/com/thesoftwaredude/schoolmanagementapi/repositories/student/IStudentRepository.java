package com.thesoftwaredude.schoolmanagementapi.repositories.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thesoftwaredude.schoolmanagementapi.domains.student.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {    
}
