package com.falcontech.tacoe001cud.v1;

import com.falcontech.tacoe001cud.service.TacoOrderService;
import com.falcontech.tacoe001cud.model.TacoOrder;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/v1/order")
public class TacoOrderController {
  private final TacoOrderService tacoOrderService;

  public TacoOrderController(TacoOrderService tacoOrderService) {
    this.tacoOrderService = tacoOrderService;
  }
  @PostMapping("/add")
  public TacoOrder addTacoOrder(@RequestBody TacoOrder tacoOrder) {
    return tacoOrderService.saveTacoOrder(tacoOrder);
  }
  @DeleteMapping("/{id}")
  public void deleteOrderById(@PathVariable Long id) {
    tacoOrderService.deleteTacoById(id);
  }
}
