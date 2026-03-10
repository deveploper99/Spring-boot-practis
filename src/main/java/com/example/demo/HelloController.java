package com.example.demo;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @GetMapping("/students")
    public String getAlldata(){
        ArrayList<String> students = new ArrayList<>();
        students.add("Rassel Hassan");
        students.add("Siam Ahmed");
        students.add("Efraz khan");
        students.add("Habibur Rahman");


        return students.get(1);
    }

}
