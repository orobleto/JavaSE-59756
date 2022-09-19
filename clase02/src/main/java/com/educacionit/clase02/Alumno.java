package com.educacionit.clase02;

public class Alumno {
// atributos instancia
	int numeroDocumento;
	String nombre;
	String apellido;
	long telefono;
	String direccion;
	boolean activo;
	byte anioNacimiento;
	byte edad;

	Alumno() {
		
	}

	// metodos

	Alumno(int numeroDocumento, String nombre, String apellido, long telefono, String direccion, boolean activo,
			byte anioNacimiento, byte edad) {

		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.activo = activo;
		this.anioNacimiento = anioNacimiento;
		this.edad = edad;
	}

	// firma del metodo
	void alumnoActivo(boolean activo) {// false true
		this.activo = activo;
		calcularEdad();
	}

	byte calcularEdad() {
		return (byte) (2022 - anioNacimiento);
	}

	byte calcularEdad(byte anio) {
		return (byte) (anio - anioNacimiento);
	}

}
