package com.solvedcard.beans.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "ROOM_TYPE")
@Data
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column()
    private String description;

    @Column()
    private BigDecimal pricePerNight;

    @Column()
    private int capacity;

    @OneToMany(mappedBy = "roomType")
    private Set<Room> rooms;

}
