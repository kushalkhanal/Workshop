package org.example.application_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    //    primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_setup_seq_gen")
    @SequenceGenerator(name = "user_setup_seq_gen", sequenceName = "user_setup_seq", allocationSize = 1)
    @Id
    private long userId;

    @Column(name = "fullName", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "roles", nullable = false)
    private RolesType roles;


}
