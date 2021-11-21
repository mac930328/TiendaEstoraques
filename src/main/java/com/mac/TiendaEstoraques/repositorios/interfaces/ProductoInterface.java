package com.mac.TiendaEstoraques.repositorios.interfaces;

import com.mac.TiendaEstoraques.modelos.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoInterface extends CrudRepository<Producto, Long> {
}
