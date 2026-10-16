package co.edu.unbosque.model;

import java.util.ArrayList;

public class MaquinaRegistradora {

    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public void agregarProducto(String nombreProducto, int precioProducto) {
        listaProductos.add(new Producto(nombreProducto, precioProducto));
    }

    // Getter opcional para ver la lista desde controlador
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
}
