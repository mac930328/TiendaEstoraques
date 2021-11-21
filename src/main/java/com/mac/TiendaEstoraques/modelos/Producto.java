package com.mac.TiendaEstoraques.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private Long cantidad;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"pedido", "producto"})
    List<ProductoXPedido> productosXPedido;
}
