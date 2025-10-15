package com.example.Gestion_Restaurantes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }


    @GetMapping("/cliente/menu")
    public String menuCliente() {
        return "cliente/menu";
    }

    @GetMapping("/cliente/carrito")
    public String carritoCliente() {
        return "cliente/carrito";
    }

    @GetMapping("/cliente/pedido_estado")
    public String pedidoEstadoCliente() {
        return "cliente/pedido_estado";
    }

    @GetMapping("/cliente/perfil")
    public String perfilCliente() {
        return "cliente/perfil";
    }

    // Dashboard admin
    @GetMapping("/dashboard/admin")
    public String dashboardAdmin() {
        return "dashboard/admin";
    }

    // Dashboard delivery
    @GetMapping("/dashboard/delivery")
    public String dashboardDelivery() {
        return "dashboard/delivery";
    }

    // Dashboard jefe
    @GetMapping("/dashboard/jefe")
    public String dashboardJefe() {
        return "dashboard/jefe";
    }

    // Admin módulos
    @GetMapping("/admin/pedidos")
    public String pedidosAdmin() {
        return "admin/pedidos";
    }

    @GetMapping("/admin/inventario")
    public String inventarioAdmin() {
        return "admin/inventario";
    }

    @GetMapping("/admin/platos")
    public String platosAdmin() {
        return "admin/platos";
    }

    @GetMapping("/admin/proveedores")
    public String proveedoresAdmin() {
        return "admin/proveedores";
    }

    @GetMapping("/admin/ordenes_compra")
    public String ordenesCompraAdmin() {
        return "admin/ordenes_compra";
    }

    @GetMapping("/admin/reportes")
    public String reportesAdmin() {
        return "admin/reportes";
    }

    // Jefe módulos
    @GetMapping("/jefe/reportes_global")
    public String reportesGlobal() {
        return "jefe/reportes_global";
    }

    @GetMapping("/jefe/metricas")
    public String metricasJefe() {
        return "jefe/metricas";
    }

    @GetMapping("/jefe/gestion_personal")
    public String gestionPersonal() {return "jefe/gestion_personal";}

    @GetMapping("/jefe/inventario_local")
    public String inventariolocal() {return "jefe/inventario_local";}

    @GetMapping("/jefe/pedidos_pendientes")
    public String pedidospendientes() {return "jefe/pedidos_pendientes";}

    @GetMapping("/jefe/finanzas_sucursal")
    public String finanzassucursal() {return "jefe/finanzas_sucursal";}

    // Error
    @GetMapping("/error")
    public String errorPage() {
        return "error";
    }
}
