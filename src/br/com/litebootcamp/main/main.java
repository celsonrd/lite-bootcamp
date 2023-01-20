package br.com.litebootcamp.main;

import br.com.litebootcamp.repository.Bootcamp;
import br.com.litebootcamp.repository.Mentor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mentor mentor = new Mentor("Celson", "Java");
		
		System.out.println(mentor.getNome());
		System.out.println(mentor.getArea());
		
		
		Bootcamp bt = new Bootcamp("Orangetech", "java intermediario", "Inter", "back end");
		
		System.out.println(bt.getArea());
		System.out.println(bt.getCargaHoraria());
		System.out.println(bt.getDescricao());
		System.out.println(bt.getPatrocinador());
		System.out.println(bt.getTitulo());
		
	}

}
