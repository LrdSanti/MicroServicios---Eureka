package com.msvc.rating.rating_service.service;

import com.msvc.rating.rating_service.entity.Rating;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);
    List<Rating> findAll();
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}
