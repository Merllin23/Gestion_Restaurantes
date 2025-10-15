package com.example.Gestion_Restaurantes.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "insumo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_insumo;

    private String nombre;
    private String unidad_medida;

    @OneToMany(mappedBy = "insumo")
    private List<Inventario> inventarios;

    @OneToMany(mappedBy = "insumo")
    private List<OrdenCompra> ordenesCompra;
}
