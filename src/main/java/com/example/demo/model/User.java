package com.example.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;


@Getter
@Setter
public class User {
    @NotNull(message = "ID should not be null")
    private Long id;
    @NotBlank(message = "name should not be null")
    private String name;
    @NotBlank(message = "Email should not be empty")
    @Email(message = "Invalid email format")
    private String email;

    public User() {}

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
