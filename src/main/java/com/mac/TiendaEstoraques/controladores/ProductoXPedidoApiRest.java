package com.mac.TiendaEstoraques.controladores;

import com.mac.TiendaEstoraques.modelos.ProductoXPedido;
import com.mac.TiendaEstoraques.servicios.ProductoXPedidoServicio;
import com.mac.TiendaEstoraques.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producto-x-pedido")
@CrossOrigin("*")
public class ProductoXPedidoApiRest extends ControladorGenericoAbstracto<ProductoXPedido, Long> {
    @Autowired
    private ProductoXPedidoServicio servicio;

    @Override
    public ServicioGenericoAbstracto<ProductoXPedido, Long> getService() {
        return servicio;
    }
}
