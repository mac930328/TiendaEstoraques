package com.mac.TiendaEstoraques.controladores;

import com.mac.TiendaEstoraques.modelos.Cliente;
import com.mac.TiendaEstoraques.servicios.ClienteServicio;
import com.mac.TiendaEstoraques.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")
public class ClienteApiRest extends ControladorGenericoAbstracto<Cliente, Long> {

    @Autowired
    private ClienteServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Cliente, Long> getService() {
        return servicio;
    }
}
