package com.solvedcard.beans.dtos;

import com.solvedcard.beans.entities.StaffRole;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffDTO {
    private String id;
    private String firstName;
    private String lastName;
    private StaffRole role;
    private String email;
    private String phone;
    private BigDecimal salary;
    private Date dob;
    private String hotelId;
}
