package com.springboot.demo.mycoolapp.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;
    @Column(name = "age", nullable = false, length = 10)
    private int age;
    @Column(name = "address", nullable = false, length = 50)
    private String address;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "phone", nullable = false, length = 50)
    private String phone;
    @Column(name = "gender", nullable = false)
    private String gender;

}
