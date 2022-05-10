package com.pederapido.pederapido.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusPedido {
	
	ABERTO(1), EM_PREPARACAO(2), PREPARO_FINALIZADO(3);
	
	private final int value;
}
