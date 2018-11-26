package com.wwb.model;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Data
@Entity
@Table(name = "imu-user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "username")
    private String username;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;
}
