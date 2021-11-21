package com.mac.TiendaEstoraques.repositorios;

import com.mac.TiendaEstoraques.modelos.Cliente;
import com.mac.TiendaEstoraques.modelos.ProductoXPedido;
import com.mac.TiendaEstoraques.repositorios.interfaces.PedidoInterfarce;
import com.mac.TiendaEstoraques.repositorios.interfaces.ProductoXPedidoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoXPedidoRepositorio extends RepositorioGenericoAbstracto<ProductoXPedido,Long>{

    @Autowired
    private ProductoXPedidoInterface anInterface;

    @Override
    public CrudRepository<ProductoXPedido, Long> getDao() {
        return anInterface;
    }
}
