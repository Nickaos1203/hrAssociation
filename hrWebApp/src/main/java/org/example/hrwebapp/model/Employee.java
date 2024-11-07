package org.example.hrwebapp.model;

import lombok.Data;

@Data
public class Employee {
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;

    public Employee(long id, String first_name, String last_name, String email, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }
}
