package com.falcontech.tacoe001cud.repo;

import com.falcontech.tacoe001cud.model.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoOrderRepository extends JpaRepository<TacoOrder, Long> {
  @Procedure(procedureName = "deleteTacoOrder")
  void deleteOrderByIdPS(Long id);
}
