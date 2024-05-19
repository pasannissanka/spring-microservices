package com.solvedcard.hotelservice.services;

import com.solvedcard.beans.dtos.HotelDTO;
import com.solvedcard.beans.dtos.requests.OnboardingRequest;

/**
 * Onboarding service
 */
public interface OnboardingService {

    HotelDTO onboardHotel(OnboardingRequest payload);
}
