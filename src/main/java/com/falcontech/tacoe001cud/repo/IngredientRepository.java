package com.falcontech.tacoe001cud.repo;

import com.falcontech.tacoe001cud.model.Ingredient;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

  @Modifying
  @Query(
      value = "UPDATE Ingredient SET enabled = 0 WHERE id = ?1",
      nativeQuery = true)
  void disableIngredient(String id);

  @Modifying
  @Query(
      value = "UPDATE Ingredient SET enabled = 1 WHERE id = ?1",
      nativeQuery = true)
  void enableIngredient(String id);
}
