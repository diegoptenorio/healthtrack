package com.healthtrack.mobile.model;

/**
 * Class de exerc�cios do treino
 * @author Diego Ten�rio
 * @version 1.0
 */
public class Exercicio {
	
	/**
	 * Nome do exerc�cio
	 */
	private String nome;
	
	/**
	 * Quantas s�ries
	 */
	private int series;
	
	/**
	 * Quantas repeti��es
	 */
	private int repeticoes;
	
	/**
	 * Qual a intensidade
	 */
	private int intensidade;
	
	/**
	 * Qual medida da intensidade
	 */
	private String medida;
	
	/**
	 * Construtor padr�o
	 */
	public Exercicio() {
	}
	
	/**
	 * @param nome - nome do exerc�cio
	 * @param series - quantidade de s�ries do exerc�cio
	 * @param repeticoes - quantidade de repeti��es
	 * @param intensidade - intensidade do exerc�cio
	 * @param medida - medida de intensidade
	 */
	public Exercicio(
		String nome,
		int series,
		int repeticoes,
		int intensidade,
		String medida
	) {
		this.nome = nome;
		this.series = series;
		this.repeticoes = repeticoes;
		this.intensidade = intensidade;
		this.medida = medida;
	}

	/**
	 * @return Retorna o nome do exerc�cio
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome - nome do exerc�cio
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Retorna a quantidade de s�ries
	 */
	public int getSeries() {
		return series;
	}

	/**
	 * @param series - quantidade de s�ries do exerc�cio
	 */
	public void setSeries(int series) {
		this.series = series;
	}

	/**
	 * @return Retorna a quantidade de repeti��es
	 */
	public int getRepeticoes() {
		return repeticoes;
	}

	/**
	 * @param repeticoes - quantidade de repeti��es
	 */
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	/**
	 * @return Retorna a intensidade
	 */
	public int getIntensidade() {
		return intensidade;
	}

	/**
	 * @param intensidade - intensidade do exerc�cio
	 */
	public void setIntensidade(int intensidade) {
		this.intensidade = intensidade;
	}

	/**
	 * @return Retorna a medida de intensidade
	 */
	public String getMedida() {
		return medida;
	}

	/**
	 * @param medida - medida de intensidade
	 */
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	

}
