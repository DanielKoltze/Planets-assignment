package com.example.demo.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;
    @NotNull
    @Column(name = "customer_first_name")
    private String firstName;
    @NotNull
    @Column(name = "customer_last_name")
    private String lastName;
    @NotNull
    @Column(name = "customer_email")
    private String email;
}
