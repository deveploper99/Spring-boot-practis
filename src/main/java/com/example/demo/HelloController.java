package com.example.demo;
import com.example.demo.dto.RequestDto;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class HelloController {

    @Autowired
    StudentService studentService;

    @GetMapping("/u")
    public List<StudentDTO> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping
    public StudentDTO createStudent(@Valid @RequestBody RequestDto studentDTO){
        return studentService.saveStudent(studentDTO);
    }


}
