package com.example.POC.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User extends Auditable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

}
