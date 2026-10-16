package co.edu.unbosque.controller;

import co.edu.unbosque.model.MaquinaRegistradora;
import co.edu.unbosque.model.Producto;
import co.edu.unbosque.view.Consola;

public class Controlador {

    private MaquinaRegistradora maquinaRegistradora;
    private Consola consola;

    public void ejecutar() {
        maquinaRegistradora = new MaquinaRegistradora();
        consola = new Consola();

        int opcionMenu;
        do {
            opcionMenu = consola.menuConsola();
            
            switch (opcionMenu) {
                case 1 -> {
                    String nombreProducto = consola.pedirNombreProducto();
                    int precioProducto = consola.ingresarPrecioProducto();
                    maquinaRegistradora.agregarProducto(nombreProducto, precioProducto);
                    consola.mostrarMensaje("Producto agregado a la lista.");
                }
                case 2 -> consola.mostrarMensaje("Saliendo...");
                default -> consola.mostrarMensaje("Opción inválida.");
            }
        } while (opcionMenu != 2);
    }
}
