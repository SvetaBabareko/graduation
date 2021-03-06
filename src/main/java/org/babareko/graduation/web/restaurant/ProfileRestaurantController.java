package org.babareko.graduation.web.restaurant;

import org.babareko.graduation.model.Restaurant;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ProfileRestaurantController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProfileRestaurantController extends AbstractRestaurantController{
    static final String REST_URL = "/rest/profile/restaurants";

    @GetMapping
    public List<Restaurant> getAll() {
        return super.getAll();
    }
}
