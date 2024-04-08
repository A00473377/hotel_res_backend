package com.hotelreservationsystem.hrs.controllers;


import com.hotelreservationsystem.hrs.dtos.CreateHotelsDTO;
import com.hotelreservationsystem.hrs.filters.HotelFilter;
import com.hotelreservationsystem.hrs.models.Hotel;
import com.hotelreservationsystem.hrs.services.HotelService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

}
