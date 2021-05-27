package org.babareko.graduation.util;

import org.babareko.graduation.model.Restaurant;
import org.babareko.graduation.to.RestaurantTO;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantUtil {
    public RestaurantUtil() {
    }

    public static List<RestaurantTO> getTos(List<Restaurant> restaurants) {
        return restaurants.stream()
                .map(restaurant -> createTo(restaurant))
                .collect(Collectors.toList());
    }

    private static RestaurantTO createTo(Restaurant restaurant) {
        return new RestaurantTO(restaurant.getId(), restaurant.getName(), restaurant.getDescription());
    }
}
