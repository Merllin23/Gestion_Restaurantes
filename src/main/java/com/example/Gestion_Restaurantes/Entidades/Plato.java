package com.example.Gestion_Restaurantes.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "plato")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_plato;

    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private BigDecimal precio;
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "plato")
    private List<DetallePedido> detallesPedido;
}
