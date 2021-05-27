package org.babareko.graduation.repository;

import org.babareko.graduation.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = true)
public interface DishRepository extends JpaRepository<Dish,Integer> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Dish d WHERE d.id=:id ")
    int deleteById(@Param("id") int id);

    @Modifying
    @Transactional
    @Query("DELETE FROM Dish d WHERE d.name=:name ")
    int deleteByName(@Param("name") String name);

    Dish getByName(String name);

    @Query("SELECT d FROM Dish d ORDER BY d.name DESC")
    List<Dish> getAll();
}
