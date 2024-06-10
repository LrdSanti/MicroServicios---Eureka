package com.msvc.hotel.service;

import com.msvc.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotelById(String id);
}
