package br.com.litebootcamp.repository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private String patrocinador;
	private String area;
	private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	private Set<Desenvolvedor> devsInscritos = new HashSet<>();
	private Set<Curso> curso = new HashSet<>();
	private Set<Mentoria> mentoria = new HashSet<>();
	
	public Bootcamp(String nome, String descricao, String patrocinador, String area, Set<Curso> curso, Set<Mentoria> mentoria) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.patrocinador = patrocinador;
		this.area = area;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public String getPatrocinador() {
		return patrocinador;
	}
	
	public Set<Desenvolvedor> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Desenvolvedor> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public Set<Curso> getCurso() {
		return curso;
	}

	public void setCurso(Set<Curso> curso) {
		this.curso = curso;
	}

	public Set<Mentoria> getMentoria() {
		return mentoria;
	}

	public void setMentoria(Set<Mentoria> mentoria) {
		this.mentoria = mentoria;
	}

}
