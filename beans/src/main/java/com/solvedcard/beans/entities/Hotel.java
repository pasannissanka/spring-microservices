package com.solvedcard.beans.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "HOTEL")
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column()
    private String address;

    @Column()
    private String city;

    @Column()
    private String state;

    @Column()
    private String zip;

    @Column()
    private String phone;

    @Column()
    private String email;

    @OneToMany(mappedBy = "hotel")
    private Set<Room> rooms;
}
