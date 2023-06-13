package com.example.Booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class FlightBooking {
    @GetMapping("/FlightBooking")
    public String getData(){
        return "Please book your Flight tickets from Booking";
    }
}
