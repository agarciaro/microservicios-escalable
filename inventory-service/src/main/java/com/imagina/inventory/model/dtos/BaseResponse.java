package com.imagina.inventory.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {

	private String[] errorMessages;

	public boolean hasErrors() {
		return errorMessages != null && errorMessages.length > 0;
	}
}
