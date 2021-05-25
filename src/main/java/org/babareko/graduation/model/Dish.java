package org.babareko.graduation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

@Entity
@Table(name = "dishes", uniqueConstraints = {@UniqueConstraint(columnNames = {"name", "restaurant_id"}, name = "dishes_unique_name_restaurant_id_idx")})
public class Dish extends AbstractEntity {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 1, max = 100)
    private String name;

    @Column(name = "price", nullable = false)
    @NotNull
    @Range(min = 0, max = 10000)
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Dish() {
    }

    public Dish(Integer id, @NotBlank @Size(min = 1, max = 100) String name, @NotNull @Range(min = 0, max = 10000) Double price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    public Dish(Dish d) {
        this(d.getId(), d.getName(), d.getPrice());
    }

}
