package com.imagina.inventory.service;

import java.util.List;

import com.imagina.inventory.model.dtos.BaseResponse;
import com.imagina.inventory.model.dtos.OrderItemRequest;

public interface IInventoryService {

	boolean isInStock(String sku);

	BaseResponse areInStock(List<OrderItemRequest> orderItems);

}