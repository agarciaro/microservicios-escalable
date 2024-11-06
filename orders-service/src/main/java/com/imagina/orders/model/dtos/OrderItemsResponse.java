package com.imagina.orders.model.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrderItemsResponse {
	
	private final Long id; 
	private final String sku;
	private final Double price;
	private final Long quantity;
	
}
