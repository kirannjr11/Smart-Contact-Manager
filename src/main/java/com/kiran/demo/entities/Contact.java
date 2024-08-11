package com.kiran.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    @Column(length = 1000)
    private String about;

    private String picture;

    @Column(length = 100)
    private String descriptions;

    private boolean favorite = false;

    private String websiteLink;
    private String linkedINLink;

    @ManyToOne
    private User user;
}
