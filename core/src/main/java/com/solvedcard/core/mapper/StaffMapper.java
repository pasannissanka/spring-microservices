package com.solvedcard.core.mapper;

import com.solvedcard.beans.dtos.StaffDTO;
import com.solvedcard.beans.entities.Staff;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaffMapper {
    private final ModelMapper modelMapper;

    @Autowired
    public StaffMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public StaffDTO convertToDto(Staff staff) {
        StaffDTO staffDTO = modelMapper.map(staff, StaffDTO.class);
        staffDTO.setHotelId(staff.getHotel().getId());
        return staffDTO;
    }

    public Staff convertToEntity(StaffDTO staffDTO) {
        Staff staff = modelMapper.map(staffDTO, Staff.class);
        // Note: You'll need to fetch and set the Hotel entity based on its ID here
        return staff;
    }
}
