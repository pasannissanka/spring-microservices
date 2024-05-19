package com.solvedcard.beans.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "STAFF")
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private StaffRole role;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    @Column
    private BigDecimal salary;

    @Column
    private Date dob;

    @ManyToOne()
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;
}
