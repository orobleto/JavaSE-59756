package com.educacionit.clase01;

public class CicloIndeterminados {
	public static void main(String[] args) {
		// 5 % de inflacion anual el producto cuesta 50 pesos en cuantos meses el
		// producto valdra 100 o mas pesos

		// indeterminados no sabemos cuando finalizan
		int i = 0;
		int x = 0;

		// 99% 0iteraciones max
		while (i < 20) { // hasta que exista una fila que leer
			System.out.println("i" + (++i));
		}

		// do while()

		// 1 - infi
		do {
			System.out.println("x" + x);
			x++;
		} while (x < 20);

		// determinados sabemos la cantidad de iteraciones
		// leer el dato
		// for
	}
}
