package com.springboot.demo.mycoolapp.repository;

import com.springboot.demo.mycoolapp.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentImplementation extends CrudRepository<Student,Long> {


}
