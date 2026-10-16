package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Producto {
    
    private String nombreProducto;
    private int precioProducto;
    private double precioProductoMasIVA;
    private LocalDateTime tiempoLocal;

    /**
     * Constructor principal - Calcula IVA automáticamente (19%)
     */
    public Producto(String nombreProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.precioProductoMasIVA = precioProducto * 1.19;  // Precio + 19% IVA
        this.tiempoLocal = LocalDateTime.now();
    }

    // Getters y Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
        this.precioProductoMasIVA = precioProducto * 1.19;  // Recalcula IVA
    }

    public double getPrecioProductoMasIVA() {
        return precioProductoMasIVA;
    }

    public void setPrecioProductoMasIVA(double precioProductoMasIVA) {
        this.precioProductoMasIVA = precioProductoMasIVA;
    }

    public LocalDateTime getTiempoLocal() {
        return tiempoLocal;
    }

    public void setTiempoLocal(LocalDateTime tiempoLocal) {
        this.tiempoLocal = tiempoLocal;
    }

    @Override
    public String toString() {
        return String.format("Producto{nombre='%s', precio=$%d, precioConIVA=$%.2f, tiempo=%s}",
                nombreProducto, precioProducto, precioProductoMasIVA, tiempoLocal);
    }
}
