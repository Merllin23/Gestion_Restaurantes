package com.example.Gestion_Restaurantes.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "reporte_ventas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReporteVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reporte;

    private LocalDate fecha;
    private BigDecimal total_ventas;

    @Column(columnDefinition = "TEXT")
    private String platos_mas_vendidos;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;
}
