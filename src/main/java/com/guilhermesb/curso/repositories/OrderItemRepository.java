package com.guilhermesb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermesb.curso.entities.OrderItem;
import com.guilhermesb.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

