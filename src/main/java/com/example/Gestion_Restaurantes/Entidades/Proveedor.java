package com.example.Gestion_Restaurantes.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "proveedor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proveedor;

    private String nombre;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "proveedor")
    private List<OrdenCompra> ordenesCompra;
}
