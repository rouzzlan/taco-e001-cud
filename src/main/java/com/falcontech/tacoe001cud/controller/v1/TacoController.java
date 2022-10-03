package com.falcontech.tacoe001cud.controller.v1;

import com.falcontech.tacoe001cud.service.TacoService;
import com.falcontech.tacoe001cud.model.Taco;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/v1/tacos")
public class TacoController {
  private final TacoService tacoService;

  public TacoController(TacoService tacoService) {
    this.tacoService = tacoService;
  }

  @PostMapping("/add")
  public Taco addTaco(@RequestBody Taco taco) {
    return tacoService.saveTaco(taco);
  }

  @PutMapping("/update")
  public Taco updateTaco(@RequestBody Taco taco) {
    return tacoService.saveTaco(taco);
  }

  @DeleteMapping("/{id}")
  public void deleteTacoById(@PathVariable Long id) {
    tacoService.deleteTacoByID(id);
  }
}
