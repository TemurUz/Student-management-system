package com.example.studentmanagemnetsystem.service.impl;

import com.example.studentmanagemnetsystem.entity.Student;
import com.example.studentmanagemnetsystem.repository.StudentRepository;
import com.example.studentmanagemnetsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        try {
            studentRepository.deleteById(id);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
