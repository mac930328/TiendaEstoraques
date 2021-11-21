package com.mac.TiendaEstoraques.controladores;

import com.mac.TiendaEstoraques.modelos.Producto;
import com.mac.TiendaEstoraques.servicios.ProductoServicio;
import com.mac.TiendaEstoraques.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin("*")
public class ProductoApiRest extends ControladorGenericoAbstracto<Producto, Long> {
    @Autowired
    private ProductoServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Producto, Long> getService() {
        return servicio;
    }
}
