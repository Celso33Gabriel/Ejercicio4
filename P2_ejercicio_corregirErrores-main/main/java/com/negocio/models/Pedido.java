package com.negocio.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Producto> productos;
    private LocalDateTime fecha;
    private double total;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = LocalDateTime.now();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            actualizarTotal(); // método centralizado
        }
    }

    private void actualizarTotal() {
        total = productos.stream()
                .mapToDouble(p -> p.getPrecio()) // accede con getter
                .sum();
    }

    public Producto obtenerPrimerProducto() {
        if (!productos.isEmpty()) {
            return productos.get(0);
        }
        return null;
    }

    public double aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) return total;
        return total - (total * porcentaje / 100);
    }

    // Getters
    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public List<Producto> getProductos() { return new ArrayList<>(productos); }
    public LocalDateTime getFecha() { return fecha; }
    public double getTotal() { return total; }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente.getNombre() +
                ", productos=" + productos.size() +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
}