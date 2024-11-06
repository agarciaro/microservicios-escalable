package com.imagina.inventory.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imagina.inventory.model.dtos.BaseResponse;
import com.imagina.inventory.model.dtos.OrderItemRequest;
import com.imagina.inventory.service.IInventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

	private final IInventoryService inventoryService;

	@GetMapping("/{sku}")
	@ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@PathVariable String sku) {
		return inventoryService.isInStock(sku);
	}

	@PostMapping("/in-stock")
	@ResponseStatus(HttpStatus.OK)
	public BaseResponse areInStock(@RequestBody List<OrderItemRequest> orderItems) {
		return inventoryService.areInStock(orderItems);
	}

}
