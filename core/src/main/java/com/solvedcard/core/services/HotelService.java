package com.solvedcard.core.services;

import com.solvedcard.beans.dtos.HotelDTO;
import com.solvedcard.beans.entities.Hotel;

import java.util.List;

/**
 * Hotel service
 */
public interface HotelService {

    /**
     * Create Hotel
     * @param hotel
     * @return
     */
    Hotel createHotel(HotelDTO hotel);

    /**
     * Update Hotel
     * @param hotel
     * @return
     */
    Hotel updateHotel(Hotel hotel);

    /**
     * Delete Hotel
     * @param hotel
     */
    void deleteHotel(Hotel hotel);

    /**
     * Get all hotels
     * @return
     */
    List<Hotel> getAllHotels();

    /**
     * Search hotels
     * @param search
     * @return
     */
    List<Hotel> searchHotels(String search);

    /**
     * Get hotel by id
     * @param id
     * @return
     */
    Hotel getHotelById(Long id);

    /**
     * Get hotel by name
     * @param name
     * @return
     */
    Hotel getHotelByName(String name);

}
