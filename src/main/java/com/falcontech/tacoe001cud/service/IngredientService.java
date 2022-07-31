package com.falcontech.tacoe001cud.service;

import com.falcontech.tacoe001cud.model.Ingredient;
import com.falcontech.tacoe001cud.repo.IngredientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IngredientService {
  private final IngredientRepository ingredientRepository;

  public IngredientService(IngredientRepository ingredientRepository) {
    this.ingredientRepository = ingredientRepository;
  }
  @Transactional
  public Ingredient saveIngredient(Ingredient ingredient) {
    return ingredientRepository.save(ingredient);
  }

  @Transactional
  public void disableIngredient(String id) {
    ingredientRepository.disableIngredient(id);
  }
}
