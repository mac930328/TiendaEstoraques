package com.mac.TiendaEstoraques.modelos;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "productos_x_pedido")
public class ProductoXPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
