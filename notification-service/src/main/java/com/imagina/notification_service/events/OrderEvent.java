package com.imagina.notification_service.events;


import com.imagina.notification_service.model.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
	private String orderNumber;
	private int itemsCount;
	private OrderStatus orderStatus;
}
