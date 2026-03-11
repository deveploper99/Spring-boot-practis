package com.example.demo.dto;

import lombok.Data;
import org.hibernate.boot.model.internal.StrictIdGeneratorResolverSecondPass;

@Data
public class StudentDTO {
    private String name;
    private String email;
    private String department;

}
