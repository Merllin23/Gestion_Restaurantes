package com.example.Gestion_Restaurantes.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "sucursal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sucursal;

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "sucursal")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "sucursal")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "sucursal")
    private List<Inventario> inventarios;

    @OneToMany(mappedBy = "sucursal")
    private List<OrdenCompra> ordenesCompra;

    @OneToMany(mappedBy = "sucursal")
    private List<ReporteVentas> reportesVentas;
}
