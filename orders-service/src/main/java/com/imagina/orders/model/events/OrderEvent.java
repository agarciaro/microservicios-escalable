package com.imagina.orders.model.events;

import com.imagina.orders.model.enums.OrderStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderEvent {
	private final String orderNumber;
	private final int itemsCount; 
	private final OrderStatus orderStatus;
}
