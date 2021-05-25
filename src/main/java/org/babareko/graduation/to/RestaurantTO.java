package org.babareko.graduation.to;

public class RestaurantTO {
    private final Integer id;
    private final String name;
    private final String description;

    public RestaurantTO(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
