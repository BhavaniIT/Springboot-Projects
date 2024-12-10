package com.ecommerce.inventory_service.repository;

import com.ecommerce.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

    Optional<Inventory> findBySkuCode(String skuCode);
}