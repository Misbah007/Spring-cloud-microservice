package com.misbah.student_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private int age;
    private String gender;
    private String schoolId;

    // Custom constructor for excluding gender
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }
}
