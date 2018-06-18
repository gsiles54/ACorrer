package com.unlam.acorrer.carrera;

public class Categoria {

	private char sexo;
	private Integer edadMin;
	private Integer edadMax;
	private Integer orden;
	public Categoria(char sexo, Integer edadMin,Integer edadMax,Integer orden) {
		this.sexo=sexo;
		this.edadMax=edadMax;
		this.edadMin=edadMin;
		this.orden=orden;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Integer getEdadMin() {
		return edadMin;
	}
	public void setEdadMin(Integer edadMin) {
		this.edadMin = edadMin;
	}
	public Integer getEdadMax() {
		return edadMax;
	}
	public void setEdadMax(Integer edadMax) {
		this.edadMax = edadMax;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	
}
