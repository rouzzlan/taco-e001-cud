package com.falcontech.tacoe001cud.v1;

import com.falcontech.tacoe001cud.service.IngredientService;
import com.falcontech.tacoe001cud.model.Ingredient;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/v1/ingredients")
public class IngredientController {
  private final IngredientService ingredientService;


  public IngredientController(IngredientService ingredientService) {
    this.ingredientService = ingredientService;
  }
  @PostMapping("/add")
  public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
    return ingredientService.saveIngredient(ingredient);
  }

  @PutMapping("{id}")
  public Ingredient updateIngredient(@PathVariable String id, @RequestBody Ingredient ingredient) {
    return ingredientService.saveIngredient(ingredient);
  }
}
