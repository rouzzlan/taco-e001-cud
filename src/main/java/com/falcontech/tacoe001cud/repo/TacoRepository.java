package com.falcontech.tacoe001cud.repo;

import com.falcontech.tacoe001cud.model.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
