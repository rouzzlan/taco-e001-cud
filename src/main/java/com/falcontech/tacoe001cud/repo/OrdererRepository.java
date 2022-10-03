package com.falcontech.tacoe001cud.repo;

import com.falcontech.tacoe001cud.model.Orderer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrdererRepository extends CrudRepository<Orderer, UUID> {
}
