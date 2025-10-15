package com.example.Gestion_Restaurantes.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    private String nombre;

    @Column(unique = true)
    private String email;

    private String password;
    private String telefono;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidosRealizados;

    @OneToMany(mappedBy = "repartidor")
    private List<Pedido> pedidosAsignados;
}
