package com.falcontech.tacoe001cud.repo;

import com.falcontech.tacoe001cud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
