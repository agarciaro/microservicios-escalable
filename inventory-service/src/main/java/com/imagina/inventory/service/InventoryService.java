package com.imagina.inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.imagina.inventory.model.dtos.BaseResponse;
import com.imagina.inventory.model.dtos.OrderItemRequest;
import com.imagina.inventory.model.entities.Inventory;
import com.imagina.inventory.repositories.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService implements IInventoryService {

	private final InventoryRepository inventoryRepository;

	@Override
	public boolean isInStock(String sku) {
		var inventory = inventoryRepository.findBySku(sku);

		return inventory.filter(value -> value.getQuantity() > 0).isPresent();
	}
	
	@Override
	public BaseResponse areInStock(List<OrderItemRequest> orderItems) {

		var errorList = new ArrayList<String>();

		List<String> skus = orderItems.stream().map(OrderItemRequest::getSku).collect(Collectors.toList());

		List<Inventory> inventoryList = inventoryRepository.findBySkuIn(skus);

		orderItems.forEach(orderItem -> {
			var inventory = inventoryList.stream().filter(value -> value.getSku().equals(orderItem.getSku()))
					.findFirst();
			if (inventory.isEmpty()) {
				errorList.add("Product with sku " + orderItem.getSku() + " does not exist");
			} else if (inventory.get().getQuantity() < orderItem.getQuantity()) {
				errorList.add("Product with sku " + orderItem.getSku() + " has insufficient quantity");
			}
		});

		return errorList.size() > 0 ? new BaseResponse(errorList.toArray(new String[0])) : new BaseResponse(null);
	}

}
