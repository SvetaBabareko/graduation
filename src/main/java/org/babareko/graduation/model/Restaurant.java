package org.babareko.graduation.model;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = Restaurant.ALL, query = "select r from Restaurant r" ),

})

@Entity
@Table(name="restaurants", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "restaurants_unique_name_idx")})
public class Restaurant extends AbstractEntity{

    public static final String ALL = "Meal.all";

    @NotBlank
    @Column(name = "name", nullable = false)
    @Size(min = 1, max = 100)
    private String name;

    @NotBlank
    @Column(name = "description", nullable = false)
    @Size(min = 1, max = 250)
    private String description;

   /* public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Dish> menu;*/

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

