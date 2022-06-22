package com.healthtrack.mobile.model;

import java.util.Date;

/**
 * Classo de registro de peso
 * @author Diego Ten�rio
 * @version 1.0
 */
public class Peso {
	
	/**
	 * C�digo do peso
	 */
	private int codigo;
	
	/**
	 * Valor do peso em KG
	 */
	private double peso;
	
	/**
	 * Data de registro do peso
	 */
	private Date dataRegistro;
	
	/**
	 * Identifica��o do usu�rio
	 */
	private int idUsuario;
	
	/**
	 * Construtor padr�o
	 */
	public Peso() {
	} 
	
	/**
	 * @param codigo - c�digo do peso
	 * @param peso - peso
	 * @param dataRegistro - data de registro do peso
	 * @param imc - imc do usu�rio
	 * @param idUsuario - Identifica��o do usu�rio
	 */
	public Peso(int codigo, double peso, Date dataRegistro, double imc, int idUsuario) {
		this.codigo = codigo;
		this.peso = peso;
		this.dataRegistro = dataRegistro;
		this.idUsuario = idUsuario;
	}

	/**
	 * @return Retornar o c�digo do peso
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo - c�digo do peso
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return Retornar o peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso - peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return Retorna data do registro de um peso
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro - data de registro do peso
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna identifica��o do usu�rio
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario - identifica��o do usu�rio
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
