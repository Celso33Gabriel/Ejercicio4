package com.negocio.models;

// ERROR 1: Atributos públicos (Mala práctica de encapsulamiento)
public class Producto {
    public int id;
    public String nombre;
    double precio;
    public int stock;

    // ERROR 2: Constructor sin validaciones
    public Producto(int id, String nombre, double precio, int stock) {
        if (precio <= 0 || stock <= 0) {
            throw new IllegalArgumentException("El precio y stock no puede ser negativo");
        }
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // ERROR 3: Método que permite stock negativo
    public boolean reducirStock(int cantidad) {
        if (cantidad < 0) return false;

        if (stock >= cantidad) {
            stock -= cantidad;
            return true;
        }
        return false;
    }


    // ERROR 4: Método con lógica incorrecta
    public boolean hayStock(int cantidad) {
        return stock >= cantidad; // Debería ser >= para permitir exactamente la cantidad
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

public double getPrecio() {
    return precio;
}
}