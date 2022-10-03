package com.falcontech.tacoe001cud.controller.v1;

import com.falcontech.tacoe001cud.security.JwtUserInfo;
import com.falcontech.tacoe001cud.security.UserIdentifier;
import com.falcontech.tacoe001cud.service.TacoOrderService;
import com.falcontech.tacoe001cud.model.TacoOrder;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/v1/order")
public class TacoOrderController {
  private final TacoOrderService tacoOrderService;
  private final UserIdentifier userIdentifier;

  public TacoOrderController(TacoOrderService tacoOrderService, UserIdentifier userIdentifier) {
    this.tacoOrderService = tacoOrderService;
    this.userIdentifier = userIdentifier;
  }

  @PostMapping("/add")
  public TacoOrder addTacoOrder(@RequestHeader("Authorization") String authorization, @RequestBody TacoOrder tacoOrder) {
    JwtUserInfo jwtUserInfo = userIdentifier.getUserInfo(authorization);
    return tacoOrderService.saveTacoOrder(tacoOrder, jwtUserInfo);
  }

  @DeleteMapping("/{id}")
  public void deleteOrderById(@PathVariable Long id) {
    tacoOrderService.deleteTacoOrderById(id);
  }
}
