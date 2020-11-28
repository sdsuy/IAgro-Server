package com.entities;

public enum Tipos {
	
	INTEGER ("Entero"),
	STRING ("Cadena"),
	DOUBLE ("Decimal"),
	BOOLEAN ("Logico");
	
	private String tipo;

	private Tipos(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	public static Tipos valueOfTipos(String tipo) {
		for(Tipos tp: values()) {
			if(tp.getTipo().equals(tipo)) {
				return tp;
			}
		}
		throw new IllegalArgumentException(String.valueOf(tipo));
	}

}
