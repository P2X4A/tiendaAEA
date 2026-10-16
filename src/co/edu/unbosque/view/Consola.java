package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner consola = new Scanner(System.in);
	
	public int menuConsola() {
		System.out.println("""
				1. Registrar Producto
				2. Salir Del Programa
				""");
		return consola.nextInt();
	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	public String pedirNombreProducto() {
		System.out.println("Ingrese El Nombre Del Producto: ");
		String nombreProducto = consola.nextLine();
		consola.nextLine();
		return nombreProducto;
	}
	
	public int ingresarPrecioProducto() {
		System.out.println("Ingrese El Precio Del Producto Sin puntos o comas, Ej: 2000");
		return consola.nextInt();
	}
}
