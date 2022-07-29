package com.falcontech.tacoe001cud.service;

import com.falcontech.tacoe001cud.model.TacoOrder;
import com.falcontech.tacoe001cud.repo.TacoOrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TacoOrderService {
  private final TacoOrderRepository tacoOrderRepository;

  public TacoOrderService(TacoOrderRepository tacoOrderRepository) {
    this.tacoOrderRepository = tacoOrderRepository;
  }

  @Transactional
  public TacoOrder saveTacoOrder(TacoOrder tacoOrder) {
    return tacoOrderRepository.save(tacoOrder);
  }

  @Transactional
  public void deleteTacoOrderById(Long id) {
    tacoOrderRepository.deleteOrderByIdPS(id);
  }
}
