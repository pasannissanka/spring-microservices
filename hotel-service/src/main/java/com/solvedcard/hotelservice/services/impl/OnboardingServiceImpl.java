package com.solvedcard.hotelservice.services.impl;

import com.solvedcard.beans.dtos.HotelDTO;
import com.solvedcard.beans.dtos.requests.OnboardingRequest;
import com.solvedcard.beans.entities.Hotel;
import com.solvedcard.core.mapper.HotelMapper;
import com.solvedcard.core.services.HotelService;
import com.solvedcard.hotelservice.services.OnboardingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnboardingServiceImpl implements OnboardingService {
    private final Logger logger = LoggerFactory.getLogger(OnboardingServiceImpl.class);

    private final HotelService hotelService;
    private final HotelMapper hotelMapper;

    @Autowired
    public OnboardingServiceImpl(HotelService hotelService, HotelMapper hotelMapper) {
        this.hotelService = hotelService;
        this.hotelMapper = hotelMapper;
    }

    @Override
    public HotelDTO onboardHotel(OnboardingRequest payload) {
        logger.info("onboardHotel: [{}]", payload);

        HotelDTO hotelData = HotelDTO.builder()
                .name(payload.getName())
                .address(payload.getAddress())
                .city(payload.getCity())
                .state(payload.getState())
                .zip(payload.getZip())
                .phone(payload.getPhone())
                .email(payload.getEmail())
                .build();

        Hotel hotel = hotelService.createHotel(hotelData);
        logger.info("Hotel created: [{}]", hotel);

        return hotelMapper.convertToDto(hotel);
    }
}
