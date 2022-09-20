package com.educacionit.entidades;

import java.util.Arrays;
import java.util.Date;

public class Usuario extends EntidadGenerica {
	private String email;
	private String clave;
	private Rol[] roles;

	public Usuario() {
		super();
	}

	public Usuario(int id, boolean activo, Date fechaCreacion, String email, String clave, Rol[] roles) {
		super(id, activo, fechaCreacion);
		this.email = email;
		this.clave = clave;
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "Usuario [" + super.toString() + ", email=" + email + ", clave=" + clave + ", roles="
				+ Arrays.toString(roles) + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Rol[] getRoles() {
		return roles;
	}

	public void setRoles(Rol[] roles) {
		this.roles = roles;
	}

}
