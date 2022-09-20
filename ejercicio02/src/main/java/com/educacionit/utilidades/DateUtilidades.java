package com.educacionit.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtilidades {
	
	public static final String FECHA_ISO = "yyyy-MM-dd";
	private DateUtilidades() {

	}
	
	public static String getFechaCadena(Date fecha) {
		return new SimpleDateFormat(FECHA_ISO).format(fecha);
	}
	
}
