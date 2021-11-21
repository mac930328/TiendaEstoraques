package com.mac.TiendaEstoraques.repositorios;

import com.mac.TiendaEstoraques.modelos.Cliente;
import com.mac.TiendaEstoraques.modelos.Pedido;
import com.mac.TiendaEstoraques.repositorios.interfaces.PedidoInterfarce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepositorio extends RepositorioGenericoAbstracto<Pedido,Long>{

    @Autowired
    private PedidoInterfarce anInterface;

    @Override
    public CrudRepository<Pedido, Long> getDao() {
        return anInterface;
    }
}
