package com.example.java8.Service;

import com.example.java8.model.Student;

import java.util.List;

public interface StudentService {
      public Student saveStudent(Student student);
      public List<Student> getAllStudents();
}
