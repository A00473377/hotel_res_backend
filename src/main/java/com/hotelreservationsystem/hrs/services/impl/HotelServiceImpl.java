package com.hotelreservationsystem.hrs.services.impl;


import com.hotelreservationsystem.hrs.dtos.CreateHotelsDTO;
import com.hotelreservationsystem.hrs.filters.HotelFilter;
import com.hotelreservationsystem.hrs.models.Hotel;
import com.hotelreservationsystem.hrs.models.Reservation;
import com.hotelreservationsystem.hrs.pojo.Hotelpojo;
import com.hotelreservationsystem.hrs.services.HotelService;
import com.hotelreservationsystem.hrs.services.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl {

}

