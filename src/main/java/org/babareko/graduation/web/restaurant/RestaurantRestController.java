package org.babareko.graduation.web.restaurant;

import org.babareko.graduation.service.RestaurantService;
import org.babareko.graduation.to.RestaurantTO;
import org.babareko.graduation.util.RestaurantUtil;
import org.babareko.graduation.web.SecurityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = RestaurantRestController.REST_URL)
public class RestaurantRestController {
    static final String REST_URL = "rest/profile/restaurants";
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestaurantService restaurantService;


    @GetMapping
    public List<RestaurantTO> getAll() {
        int userId = SecurityUtil.authUserId();
        log.info("getAll for user {}", userId);
        return RestaurantUtil.getTos(restaurantService.getAll(userId));
    }
}
