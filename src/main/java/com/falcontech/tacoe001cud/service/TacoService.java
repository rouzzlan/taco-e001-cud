package com.falcontech.tacoe001cud.service;

import com.falcontech.tacoe001cud.model.Taco;
import com.falcontech.tacoe001cud.repo.TacoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TacoService {
  private final TacoRepository tacoRepository;

  public TacoService(TacoRepository tacoRepository) {
    this.tacoRepository = tacoRepository;
  }

  @Transactional
  public Taco saveTaco(Taco taco) {
    return tacoRepository.save(taco);
  }

  @Transactional
  public void deleteTacoByID(Long id) {
    tacoRepository.deleteById(id);
  }
}
