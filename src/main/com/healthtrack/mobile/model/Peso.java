package com.healthtrack.mobile.model;

import java.util.Date;

/**
 * Classo de registro de peso
 * @author Diego Tenório
 * @version 1.0
 */
public class Peso {
	
	/**
	 * Código do peso
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
	 * Identificação do usuário
	 */
	private int idUsuario;
	
	/**
	 * Construtor padrão
	 */
	public Peso() {
	} 
	
	/**
	 * @param codigo - código do peso
	 * @param peso - peso
	 * @param dataRegistro - data de registro do peso
	 * @param imc - imc do usuário
	 * @param idUsuario - Identificação do usuário
	 */
	public Peso(int codigo, double peso, Date dataRegistro, double imc, int idUsuario) {
		this.codigo = codigo;
		this.peso = peso;
		this.dataRegistro = dataRegistro;
		this.idUsuario = idUsuario;
	}

	/**
	 * @return Retornar o código do peso
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo - código do peso
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
	 * @return Retorna identificação do usuário
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario - identificação do usuário
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
