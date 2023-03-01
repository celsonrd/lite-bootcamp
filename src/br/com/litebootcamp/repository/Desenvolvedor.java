package br.com.litebootcamp.repository;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import br.com.litebootcamp.dominio.Conteudo;

public class Desenvolvedor extends Pessoa {

	private String nome;
	private String email;
	private double XP;

	private Set<Conteudo> cursosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> cursosConcluidos = new LinkedHashSet<>();

	public Set<Conteudo> getCursosInscritos() {
		return cursosInscritos;
	}

	public void setCursosInscritos(Set<Conteudo> cursosInscritos) {
		this.cursosInscritos = cursosInscritos;
	}

	public Set<Conteudo> getCursosConcluidos() {
		return cursosConcluidos;
	}

	public void setCursosConcluidos(Set<Conteudo> cursosConcluidos) {
		this.cursosConcluidos = cursosConcluidos;
	}

	public Set<Conteudo> getMentoriasInscritos() {
		return mentoriasInscritos;
	}

	public void setMentoriasInscritos(Set<Conteudo> mentoriasInscritos) {
		this.mentoriasInscritos = mentoriasInscritos;
	}

	public Set<Conteudo> getMentoriasConcluidos() {
		return mentoriasConcluidos;
	}

	public void setMentoriasConcluidos(Set<Conteudo> mentoriasConcluidos) {
		this.mentoriasConcluidos = mentoriasConcluidos;
	}

	private Set<Conteudo> mentoriasInscritos = new LinkedHashSet<>();
	private Set<Conteudo> mentoriasConcluidos = new LinkedHashSet<>();

	public double calculaXP() {
		return 0D;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.cursosInscritos.addAll(bootcamp.getCurso());
		this.mentoriasInscritos.addAll(bootcamp.getMentoria());
		bootcamp.getDevsInscritos().add(this);

	}

	public void progredirMentoria() {
		Optional<Conteudo> mentoria = this.mentoriasInscritos.stream().findFirst();
		if(mentoria.isPresent()) {
			this.mentoriasConcluidos.add(mentoria.get());
			this.mentoriasInscritos.remove(mentoria.get());
		} else {
			System.err.print("aldo deu errado");
		}
		
	}
	
	public void progredirCurso() {
		Optional<Conteudo> curso = this.cursosInscritos.stream().findFirst();
		if(curso.isPresent()) {
			this.mentoriasConcluidos.add(curso.get());
			this.mentoriasInscritos.remove(curso.get());
		} else {
			System.err.print("aldo deu errado");
		}
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getXP() {
		return XP;
	}

	public void setXP(double xP) {

		XP = xP;
	}

	public Desenvolvedor(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Desenvolvedor other = (Desenvolvedor) obj;
		return Objects.equals(nome, other.nome);
	}

}
