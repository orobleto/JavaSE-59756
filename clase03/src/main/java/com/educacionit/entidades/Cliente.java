package com.educacionit.entidades;

import javax.swing.JOptionPane;

public class Cliente {
	public long codigo;
	private char tipoDocumento = 'C';
	public int numeroDocumento;
	protected String razonSocial;

	public void mostrarInformacion() {
		JOptionPane.showMessageDialog(null, "Codigo: " + codigo + " Nombre Completo: " + razonSocial + " Tipo Documento: " + tipoDocumento);
	}
}
