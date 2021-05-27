package org.babareko.graduation.service;

import org.babareko.graduation.model.Restaurant;
import org.babareko.graduation.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    public List<Restaurant> getAll(int userId) {
        return null;
        //repository.getAll(userId);
    }


}
