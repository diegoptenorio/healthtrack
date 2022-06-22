package com.healthtrack.mobile.model;

import java.util.Date;
import java.util.ArrayList;

/**
 * Classe de usu�rio
 * @author Diego Ten�rio
 * @version 1.0
 */
public class Usuario {

	/**
	 * Nome do usu�rio
	 */
	private String nome;

	/**
	 * Email do usu�rio
	 */
	private String email;

	/**
	 * Sexo do usu�rio
	 */
	private char sexo;

	/**
	 * Data de nascimento do usu�rio
	 */
	private Date dataNascimento;

	/**
	 * Data de registro do usu�rio
	 */
	private Date dataRegistro;

	/**
	 * Altura do usu�rio
	 */
	private float altura;

	/**
	 * Hist�rico de Peso do usu�rio
	 */
	private ArrayList<Peso> pesoList = new ArrayList<Peso>();

	/**
	 * Hist�rico de Treino do usu�rio
	 */
	private ArrayList<Treino> treinoList = new ArrayList<Treino>();
	
	/**
	 * Construtor padr�o
	 */
	public Usuario () {
	}

	/**
	 * @param nome - nome do usu�rio
	 * @param email - email do usu�rio
	 * @param sexo - sexo do usu�rio
	 * @param dataNascimento - data de nascimento do usu�rio
	 * @param dataRegistro - data de registro do usu�rio
	 * @param altura - altura do usu�rio
	 */
	public Usuario(
		String nome,
		String email,
		char sexo,
		Date dataNascimento,
		Date dataRegistro,
		float altura
	) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.dataRegistro = dataRegistro;
		this.altura = altura;
	}

	/**
	 * @return Retorna nome do usu�rio
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome - nome do usu�rio
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Retorna email do usu�rio
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email - email do usu�rio
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return Retorna sexo do usu�rio
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo - sexo do usu�rio
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return Retorna data de nascimento do usu�rio
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento - data de nascimento do usu�rio
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return Retorna data de registro do usu�rio
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro - data de registro do usu�rio
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna altura do usu�rio
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura - altura do usu�rio
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return Retorna lista de peso do usu�rio
	 */
	public ArrayList<Peso> getPesoList() {
		return pesoList;
	}

	/**
	 * @param pesoList - lista de peso do usu�rio
	 */
	public void setPesoList(ArrayList<Peso> pesoList) {
		this.pesoList = pesoList;
	}

	/** 
	 * @return Retorna lista de treino do usu�rio
	 */		
	public ArrayList<Treino> getTreinoList() {
		return treinoList;
	}

	/**
	 * @param treinoList - lista de treino do usu�rio
	 */
	public void setTreinoList(ArrayList<Treino> treinoList) {
		this.treinoList = treinoList;
	}

}
