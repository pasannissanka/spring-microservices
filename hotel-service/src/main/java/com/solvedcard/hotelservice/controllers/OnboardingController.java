package com.solvedcard.hotelservice.controllers;

import com.solvedcard.beans.dtos.HotelDTO;
import com.solvedcard.beans.dtos.requests.OnboardingRequest;
import com.solvedcard.beans.dtos.responses.ResponseData;
import com.solvedcard.hotelservice.constants.SuccessMessages;
import com.solvedcard.hotelservice.services.OnboardingService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/onboarding")
public class OnboardingController {
    private final Logger logger = LoggerFactory.getLogger(OnboardingController.class);

    private final OnboardingService onboardingService;

    @Autowired
    public OnboardingController(OnboardingService onboardingService) {
        this.onboardingService = onboardingService;
    }

    /**
     * POST Onboard a hotel
     *
     * @param request OnboardingRequest
     * @return ResponseEntity<ResponseData < HotelDTO, ?>>
     */
    @PostMapping("/hotel")
    public ResponseEntity<ResponseData<HotelDTO, ?>> onboardHotel(@Valid @RequestBody() OnboardingRequest request) {
        logger.info("onboardHotel: [{}]", request);
        return ResponseEntity.ok(ResponseData.success(onboardingService.onboardHotel(request), SuccessMessages.HOTEL_CREATED));
    }
}
