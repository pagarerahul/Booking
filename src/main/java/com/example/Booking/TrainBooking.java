package com.example.Booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class TrainBooking {
    @GetMapping("/TrainBooking")
    public String getData(){
        return "Please book your Train tickets from Booking";
    }
}
