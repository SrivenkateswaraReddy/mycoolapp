package com.springboot.demo.mycoolapp.service;

import com.springboot.demo.mycoolapp.entity.Student;
import com.springboot.demo.mycoolapp.repository.StudentImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    Logger log = LoggerFactory.getLogger(StudentService.class);

    private StudentImplementation studentImplementation;

    @Autowired
    public StudentService(StudentImplementation studentImplementation) {
        this.studentImplementation = studentImplementation;
    }

    public void saveStudent(Student student) {
        studentImplementation.save(student);
    }


    public Student getStudentById(Long id) {
        return studentImplementation.findById(id).get();
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentImplementation.findAll().forEach(students::add);
        return students;
//        return (List<Student>) studentImplementation.findAll();
    }

    public void updateStudent(Student student) {
        studentImplementation.save(student);
    }

    public void deleteAllStudents() {
        studentImplementation.deleteAll();
    }

    public void deleteStudent(Student student) {
        studentImplementation.delete(student);
    }

    public void deleteStudent(Long id) {
        studentImplementation.deleteById(id);
    }
}
