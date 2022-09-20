package com.educacionit.ejercicio02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.educacionit.entidades.Rol;
import com.educacionit.entidades.Usuario;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ParseException {
		/*
		 * Date fecha = new Date(); System.out.println(fecha);
		 * 
		 * Date fecha2 = new Date(83, 2, 15);// 1983-1900 System.out.println(fecha2);
		 * 
		 * SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// y M d H m s
		 * 
		 * Date fecha3 = formato.parse("16/06/1987");
		 * 
		 * System.out.println(fecha3); System.out.println(formato.format(fecha));
		 * System.out.println(formato.format(fecha2));
		 * System.out.println(formato.format(fecha3));
		 */

		Rol[] roles = new Rol[2];
		roles[0] = new Rol(1, true, new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-26"), "ADMIN");
		roles[1] = new Rol(2, true, new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-20"), "SUP");

		Usuario usuario = new Usuario(1, true, new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-26"),
				"user1@gmail.com", "1234", roles);
		
		System.out.println(usuario);
		
	
	}
}
