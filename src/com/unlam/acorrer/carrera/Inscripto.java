package com.unlam.acorrer.carrera;

public class Inscripto {

	private Integer edad;
	private char sexo;
	private Integer nroOrden;
	private Categoria categoria;
	
	public Inscripto(Integer edad, char sexo,Integer nroOrden,Categoria categoria) {
		this.edad=edad;
		this.sexo=sexo;
		this.nroOrden=nroOrden;
		this.categoria=categoria;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Integer getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(Integer nroOrden) {
		this.nroOrden = nroOrden;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	//public void agregarPosicionLlegada()
}
