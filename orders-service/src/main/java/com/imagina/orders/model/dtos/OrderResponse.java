package com.imagina.orders.model.dtos;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrderResponse {

	private final Long id;
	private final String customerName;
	private final List<OrderItemsResponse> items;
}
