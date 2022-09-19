package com.educacionit.clase03;

import com.educacionit.entidades.Factura;
import com.educacionit.entidades.Proveedor;
import com.educacionit.utilitaria.OperacionMatematica;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Proveedor proveedor = new Proveedor();
		proveedor.numeroDocumento = -25;
		proveedor.setCodigo(-5);

		Factura fac01 = new Factura();
		fac01.setNumero(5);
		System.out.println(fac01.getNumero());
		Factura fac02 = new Factura();
		
		System.out.println(Factura.sucursal + " - " + Factura.sucursal);
		
		Factura.sucursal="Boston 4960";
		
		System.out.println(Factura.sucursal + " - " + Factura.sucursal);
		System.out.println(Proveedor.TIPO_DOCUMENTO);
		
		System.out.println(OperacionMatematica.suma(2, 3));
		
	}
	

}
