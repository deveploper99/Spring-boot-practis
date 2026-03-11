package com.example.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RequestDto {
    @NotEmpty(message = "name required")
    private String name;
    private int roll;
    private String semister;
    private String department;
    private String email;
}
