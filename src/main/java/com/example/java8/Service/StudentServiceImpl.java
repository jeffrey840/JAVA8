package com.example.java8.Service;

import org.springframework.stereotype.Service;
import com.example.java8.model.Student;
import com.example.java8.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//public class StudentServiceImpl    {
//
//}

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

//    @Override
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
}