package org.example.hrwebapp.model;

import lombok.Data;

@Data
public class Employee {

    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
}
