package com.springboot.demo.mycoolapp.controller;

import com.springboot.demo.mycoolapp.entity.Student;
import com.springboot.demo.mycoolapp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public String sayHello() {
        logger.info("Hello World!");
        return "Hello World!";
    }

    @PostMapping(value = "/student")
    public ResponseEntity<Void> createStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
        //return ResponseEntity.status(HttpStatus.OK).body(studentService);
        //return ResponseEntity.status(HttpStatus.OK).body(student);
        //return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentById(id));

    }
    @GetMapping(value = "/listAll")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();

        if (students == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
        //return ResponseEntity.status(HttpStatus.OK).body(students);
        //return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }


    @DeleteMapping(value = "/deleteStudent/{id}")
    public ResponseEntity<Void> DeleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
