package br.com.litebootcamp.dominio;

public abstract class Conteudo {
	
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	private String area;
	
	protected static final double XP = 10;
	public abstract double calculaXP();
	
	public String getArea() {
		return this.area;
	}
	
	public void setArea(String area) {
		this.area = area;
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
	
}