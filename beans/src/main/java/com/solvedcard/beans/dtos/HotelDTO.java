package com.solvedcard.beans.dtos;

import lombok.*;

import java.util.Set;

/**
 * HotelDto
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelDTO {
    private String id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private Set<RoomDTO> rooms;
}
