package com.pederapido.pederapido.data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
	private List<ItemPedidoDTO> itensPedido;
	private Long idMesa;
	private Long idPedido;
	private String status;
	private Long idRestaurante;

}
