package com.mac.TiendaEstoraques.repositorios.interfaces;

import com.mac.TiendaEstoraques.modelos.Pedido;
import com.mac.TiendaEstoraques.modelos.ProductoXPedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoInterfarce extends CrudRepository<Pedido, Long> {
}
