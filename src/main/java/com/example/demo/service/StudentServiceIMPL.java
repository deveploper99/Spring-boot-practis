package com.example.demo.service;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceIMPL implements StudentService{

    @Autowired
    StudentRepository studentRepository;


    @Override
    public StudentDTO saveStudent(RequestDto requestDto) {
        // ১. RequestDto -> Student Entity
        Student student = new Student();
        student.setName(requestDto.getName());
        student.setEmail(requestDto.getEmail());
        student.setRoll(requestDto.getRoll());
        student.setDepartment(requestDto.getDepartment());
        student.setSemister(requestDto.getSemister()); // এনটিটি ক্লাসের বানানের সাথে মিলিয়ে নিন

        // ২. Save to Database
        Student savedStudent = studentRepository.save(student);

        // ৩. Student Entity -> StudentDTO (Response)
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName(savedStudent.getName());
        studentDTO.setEmail(savedStudent.getEmail());
        studentDTO.setDepartment(savedStudent.getDepartment());
        // আপনি যদি সেমিস্টার দেখাতে চান তবে নিচের লাইনটি যোগ করুন
        // studentDTO.setSemister(savedStudent.getSemister());

        return studentDTO;
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return studentRepository.findAll().stream().map(student -> {
            StudentDTO dto = new StudentDTO();
            dto.setName(student.getName());
            dto.setEmail(student.getEmail());
            dto.setDepartment(student.getDepartment());
            return dto;
        }).collect(Collectors.toList());
    }


}
