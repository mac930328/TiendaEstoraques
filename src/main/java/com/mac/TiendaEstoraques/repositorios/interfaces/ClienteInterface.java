package com.mac.TiendaEstoraques.repositorios.interfaces;

import com.mac.TiendaEstoraques.modelos.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteInterface extends CrudRepository<Cliente,Long> {
}
