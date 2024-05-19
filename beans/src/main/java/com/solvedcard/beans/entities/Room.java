package com.solvedcard.beans.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ROOM")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "roomType_id")
    private RoomType roomType;

    @Column()
    private String number;

    @Column()
    private String status;
}
