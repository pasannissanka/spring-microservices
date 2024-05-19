package com.solvedcard.staffservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/onboarding")
public class OnboardingController extends BaseController {

    public OnboardingController() {
        super();
    }

    @RequestMapping("/staff")
    public String onboardStaff() {
        return "Staff onboarded successfully";
    }
}
