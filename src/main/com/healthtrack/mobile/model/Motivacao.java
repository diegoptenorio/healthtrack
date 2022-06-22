package com.healthtrack.mobile.model;

import java.util.Date;

/**
 * Classe do v�deo motivacional
 * @author Diego Ten�rio
 * @version 1.0
 */
public class Motivacao {
	
	/**
	 * Endere�o URL do video de motiva��o
	 */
	private String endereco;
	
	/**
	 * Data de registro do video motivacional
	 */
	private Date dataRegistro;

	/**
	 * Construtor padr�o
	 */
	public Motivacao() {
	}

	/**
	 * @param endereco - endere�o URL do v�deo
	 * @param dataRegistro - data de registro
	 */
	public Motivacao(String endereco, Date dataRegistro) {
		this.endereco = endereco;
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna endere�o da URL
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco - endere�o URL do v�deo
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return Retorna data de registro do video motivacional
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro - data de registro
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

}
