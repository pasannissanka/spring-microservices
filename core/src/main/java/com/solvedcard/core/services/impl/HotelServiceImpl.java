package com.solvedcard.core.services.impl;

import com.solvedcard.beans.dtos.HotelDTO;
import com.solvedcard.beans.entities.Hotel;
import com.solvedcard.core.mapper.HotelMapper;
import com.solvedcard.core.repositories.HotelRepository;
import com.solvedcard.core.services.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private final Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);

    private final HotelRepository hotelRepository;
    private final HotelMapper hotelMapper;


    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository, HotelMapper hotelMapper) {
        this.hotelRepository = hotelRepository;
        this.hotelMapper = hotelMapper;
    }
    /**
     * Create Hotel
     *
     * @param hotel
     * @return
     */
    @Override
    public Hotel createHotel(HotelDTO hotel) {
        logger.info("createHotel: [{}]", hotel);
        Hotel hotelEntity = hotelMapper.convertToEntity(hotel);
        return hotelRepository.save(hotelEntity);
    }

    /**
     * Update Hotel
     *
     * @param hotel
     * @return
     */
    @Override
    public Hotel updateHotel(Hotel hotel) {
        return null;
    }

    /**
     * Delete Hotel
     *
     * @param hotel
     */
    @Override
    public void deleteHotel(Hotel hotel) {

    }

    /**
     * Get all hotels
     *
     * @return
     */
    @Override
    public List<Hotel> getAllHotels() {
        return null;
    }

    /**
     * Search hotels
     *
     * @param search
     * @return
     */
    @Override
    public List<Hotel> searchHotels(String search) {
        return null;
    }

    /**
     * Get hotel by id
     *
     * @param id
     * @return
     */
    @Override
    public Hotel getHotelById(Long id) {
        return null;
    }

    /**
     * Get hotel by name
     *
     * @param name
     * @return
     */
    @Override
    public Hotel getHotelByName(String name) {
        return null;
    }
}
