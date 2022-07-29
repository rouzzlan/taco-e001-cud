package com.falcontech.tacoe001cud.service;

import com.falcontech.tacoe001cud.model.TacoOrder;
import com.falcontech.tacoe001cud.repo.TacoOrderRepository;
import com.falcontech.tacoe001cud.repo.TacoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TacoOrderService {
  private final TacoRepository tacoRepository;
  private final TacoOrderRepository tacoOrderRepository;

  public TacoOrderService(TacoRepository tacoRepository, TacoOrderRepository tacoOrderRepository) {
    this.tacoRepository = tacoRepository;
    this.tacoOrderRepository = tacoOrderRepository;
  }

  @Transactional
  public TacoOrder saveTacoOrder(TacoOrder tacoOrder) {
//    Iterable<Taco> savedTacos = tacoRepository.saveAll(tacoOrder.getTacos());

    return tacoOrderRepository.save(tacoOrder);
  }

  @Transactional
  public void deleteTacoOrderById(Long id) {
    tacoOrderRepository.deleteOrderByIdPS(id);
  }
}
