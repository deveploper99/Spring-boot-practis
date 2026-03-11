package com.example.demo.service;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.StudentDTO;


import java.util.List;

public interface StudentService {

    List<StudentDTO> getAllStudent(); // রিটার্ন টাইপ StudentDTO এর লিস্ট
    StudentDTO saveStudent(RequestDto requestDto);
}
