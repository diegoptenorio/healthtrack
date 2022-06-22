package com.healthtrack.mobile.model;

import java.util.Date;

/**
 * Classe do vídeo motivacional
 * @author Diego Tenório
 * @version 1.0
 */
public class Motivacao {
	
	/**
	 * Endereço URL do video de motivação
	 */
	private String endereco;
	
	/**
	 * Data de registro do video motivacional
	 */
	private Date dataRegistro;

	/**
	 * Construtor padrão
	 */
	public Motivacao() {
	}

	/**
	 * @param endereco - endereço URL do vídeo
	 * @param dataRegistro - data de registro
	 */
	public Motivacao(String endereco, Date dataRegistro) {
		this.endereco = endereco;
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna endereço da URL
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco - endereço URL do vídeo
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
