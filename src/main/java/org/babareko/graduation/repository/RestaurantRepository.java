package org.babareko.graduation.repository;

import org.babareko.graduation.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Modifying
    @Transactional
    @Query("DELETE FROM Restaurant r WHERE r.id=:id ")
    int deleteById(@Param("id") int id);

    @Query("SELECT r FROM Restaurant r ORDER BY r.name DESC")
    List<Restaurant> getAll();

    Restaurant getByName(String name);
}
