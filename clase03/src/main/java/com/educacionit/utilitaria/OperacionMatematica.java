package com.educacionit.utilitaria;

public class OperacionMatematica {
	public final static float PI = 3.14f;

	public static int suma(int a, int b) {
		return a + b;
	}

	// miembro de clase  -> metodo clase
	public static int calculadora(int a, int b, char operador) {
		if (operador == '/') {
			return dividir(a, b);
		}
		// OperacionMatematica op01 = new OperacionMatematica(); op01.imprimir
		return 0;
	}

	private static int dividir(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
	
	public void imprimir() {
		System.out.println("imprimiendo");
	}

	// NO OperacionMatematica op01 = new OperacionMatematica();
	// NO op01.suma(2,3)

	// OperacionMatematica.suma(2,3);
}
