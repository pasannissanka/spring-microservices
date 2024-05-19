package com.solvedcard.beans.dtos;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
    private String id;
    private String number;
    private String status;
    private String hotelId;
    private String roomTypeId;
}
