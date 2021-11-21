package com.mac.TiendaEstoraques.servicios;

import com.mac.TiendaEstoraques.modelos.Cliente;
import com.mac.TiendaEstoraques.repositorios.ClienteRepositorio;
import com.mac.TiendaEstoraques.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServicio extends ServicioGenericoAbstracto<Cliente, Long> {

    @Autowired
    private ClienteRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Cliente, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Cliente guardar(Cliente objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Cliente> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Cliente actualizar(Cliente objeto) {
        if (objeto.getId() != null) {
            Optional<Cliente> c = obtenerXId(objeto.getId());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}
