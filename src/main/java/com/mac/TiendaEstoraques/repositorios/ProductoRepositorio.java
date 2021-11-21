package com.mac.TiendaEstoraques.repositorios;

import com.mac.TiendaEstoraques.modelos.Cliente;
import com.mac.TiendaEstoraques.modelos.Producto;
import com.mac.TiendaEstoraques.repositorios.interfaces.PedidoInterfarce;
import com.mac.TiendaEstoraques.repositorios.interfaces.ProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepositorio extends RepositorioGenericoAbstracto<Producto,Long>{

    @Autowired
    private ProductoInterface anInterface;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return anInterface;
    }
}
