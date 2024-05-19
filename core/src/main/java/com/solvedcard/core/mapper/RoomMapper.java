package com.solvedcard.core.mapper;

import com.solvedcard.beans.dtos.RoomDTO;
import com.solvedcard.beans.entities.Room;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    @Autowired
    private ModelMapper modelMapper;

    public RoomDTO convertToDto(Room room) {
        RoomDTO roomDTO = modelMapper.map(room, RoomDTO.class);
        roomDTO.setHotelId(room.getHotel().getId());
        roomDTO.setRoomTypeId(room.getRoomType().getId());
        return roomDTO;
    }

    public Room convertToEntity(RoomDTO roomDTO) {
        Room room = modelMapper.map(roomDTO, Room.class);
        // Note: You'll need to fetch and set the Hotel and RoomType entities based on their IDs here
        return room;
    }
}
