package org.babareko.graduation.web.restaurant;

import org.babareko.graduation.model.Restaurant;
import org.babareko.graduation.repository.RestaurantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AbstractRestaurantController {

    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    protected RestaurantRepository restaurantRepository;

    public List<Restaurant> getAll() {
        log.info("get all restaurants");
        return restaurantRepository.findAll();
    }
}
