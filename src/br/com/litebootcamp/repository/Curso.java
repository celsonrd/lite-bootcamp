package br.com.litebootcamp.repository;

import br.com.litebootcamp.dominio.Conteudo;

public class Curso extends Conteudo{

	private String titulo;
	private String descricao;
	private int cargaHoraria;
	private int xp;

	
	
	
	public Curso(String titulo, String descricao, int cargaHoraria, int xp) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.xp = xp;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	
	@Override
	public double calculaXP() {
		// TODO Auto-generated method stub
		return XP * 4.0;
	}
	
}
