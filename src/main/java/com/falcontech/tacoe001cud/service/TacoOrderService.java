package com.falcontech.tacoe001cud.service;

import com.falcontech.tacoe001cud.model.Orderer;
import com.falcontech.tacoe001cud.model.TacoOrder;
import com.falcontech.tacoe001cud.repo.TacoOrderRepository;
import com.falcontech.tacoe001cud.security.JwtUserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class TacoOrderService {
  private final TacoOrderRepository tacoOrderRepository;
  private final OrdererService ordererService;

  public TacoOrderService(TacoOrderRepository tacoOrderRepository, OrdererService ordererService) {
    this.tacoOrderRepository = tacoOrderRepository;
    this.ordererService = ordererService;
  }

  @Transactional
  public TacoOrder saveTacoOrder(TacoOrder tacoOrder, JwtUserInfo jwtUserInfo) {
    var _order = ordererService.getOrdererById(UUID.fromString(jwtUserInfo.getUid()));
    _order.ifPresentOrElse(tacoOrder::setOrderer, () -> {
      Orderer orderer = new Orderer();
      orderer.setEmail(jwtUserInfo.getEmail());
      orderer.setId(UUID.fromString(jwtUserInfo.getUid()));
      orderer.setName(jwtUserInfo.getName());
      Orderer savedOrder = ordererService.saveOrderer(orderer);
      tacoOrder.setOrderer(savedOrder);
    });
    return tacoOrderRepository.save(tacoOrder);
  }

  @Transactional
  public void deleteTacoOrderById(Long id) {
    tacoOrderRepository.deleteOrderByIdPS(id);
  }
}
