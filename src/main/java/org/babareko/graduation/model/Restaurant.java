package org.babareko.graduation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="restaurants", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "restaurants_unique_name_idx")})
public class Restaurant extends AbstractEntity{

    @NotBlank
    @Column(name = "name", nullable = false)
    @Size(min = 1, max = 100)
    private String name;

    @NotBlank
    @Column(name = "description", nullable = false)
    @Size(min = 1, max = 250)
    private String description;

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant_id")
    private List<Dish> menu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant() {
        super();
    }

    public Restaurant(Integer id, @NotBlank @Size(min = 1, max = 100) String name, @NotBlank @Size(min = 1, max = 250) String description) {
        super(id);
        this.name = name;
        this.description = description;
    }

    public Restaurant(Restaurant r){
        this(r.getId(), r.getName(), r.getDescription());
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

