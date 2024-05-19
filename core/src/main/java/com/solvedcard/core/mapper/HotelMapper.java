package com.solvedcard.core.mapper;

import com.solvedcard.beans.dtos.HotelDTO;
import com.solvedcard.beans.entities.Hotel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelMapper {
    private final ModelMapper modelMapper;

    @Autowired
    public HotelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public HotelDTO convertToDto(Hotel hotel) {
        return modelMapper.map(hotel, HotelDTO.class);
    }

    public Hotel convertToEntity(HotelDTO hotelDTO) {
        return modelMapper.map(hotelDTO, Hotel.class);
    }
}
