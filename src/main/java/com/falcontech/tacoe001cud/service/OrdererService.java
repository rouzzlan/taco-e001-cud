package com.falcontech.tacoe001cud.service;

import com.falcontech.tacoe001cud.model.Orderer;
import com.falcontech.tacoe001cud.repo.OrdererRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class OrdererService {
  private final OrdererRepository ordererRepository;

  public OrdererService(OrdererRepository ordererRepository) {
    this.ordererRepository = ordererRepository;
  }

  public Optional<Orderer> getOrdererById(UUID id) {
    return ordererRepository.findById(id);
  }

  public Orderer saveOrderer(Orderer orderer) {
    return ordererRepository.save(orderer);
  }
}
