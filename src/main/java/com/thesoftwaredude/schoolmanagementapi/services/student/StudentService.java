package com.thesoftwaredude.schoolmanagementapi.services.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesoftwaredude.schoolmanagementapi.domains.student.Student;
import com.thesoftwaredude.schoolmanagementapi.dto.StudentDto;
import com.thesoftwaredude.schoolmanagementapi.repositories.student.IStudentRepository;

@Service
public class StudentService implements IStudentService {

    private final IStudentRepository _studentRepository; 

    @Autowired
    public StudentService(final IStudentRepository studentRepository) {
        _studentRepository = studentRepository;
    }

    @Override
    public StudentDto create(final StudentDto studentDto) {
        final Student student = studentDtoToStudent(studentDto);
        final Student savedStudent = _studentRepository.save(student);
        return studentToStudentDto(savedStudent);
    }

    private Student studentDtoToStudent(StudentDto studentDto) {
        return Student.builder()
            .id(studentDto.getId())
            .userId(studentDto.getUserId())
            .identityNumber(studentDto.getIdentityNumber())
            .firstName(studentDto.getFirstName())
            .middleName(studentDto.getMiddleName())
            .lastName(studentDto.getLastName())
            .birthDate(studentDto.getBirthDate())
            .gender(studentDto.getGender())
            .createdDate(studentDto.getCreatedDate())
            .updatedDate(studentDto.getUpdatedDate())
            .createdBy(studentDto.getCreatedBy())
            .updatedBy(studentDto.getUpdatedBy())
            .build();
    }

    private StudentDto studentToStudentDto(Student student) {
        return StudentDto.builder()
            .id(student.getId())
            .userId(student.getUserId())
            .identityNumber(student.getIdentityNumber())
            .firstName(student.getFirstName())
            .middleName(student.getMiddleName())
            .lastName(student.getLastName())
            .birthDate(student.getBirthDate())
            .gender(student.getGender())
            .createdDate(student.getCreatedDate())
            .updatedDate(student.getUpdatedDate())
            .createdBy(student.getCreatedBy())
            .updatedBy(student.getUpdatedBy())
            .build();
    }   
   
}
