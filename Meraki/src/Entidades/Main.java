package Entidades;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// User
		User user1 = new User(null);
		user1.setName("Fernando");
		user1.setEmail("fiap1@fiap.com.br");
		user1.setGenre("Masculino");
		user1.setPassword("1234");
		user1.setId(012345);
		
		System.out.println("-- Dados do usuario --");
		System.out.println("Nome de usuario: " + user1.getName());
		System.out.println("Tipo de usuario: " + user1.getType().getDescription());
		System.out.println("");
		
		// Controle de respiração
		BreathControl breathControl1 = new BreathControl();
		breathControl1.setId(987654);
		breathControl1.setTime(3.0);
		System.out.println("-- Controle de Respiração --");
		System.out.println("Id: " + breathControl1.getId());
		System.out.println("Tempo: " + breathControl1.getTime() + " minutos");
		System.out.println("");
		
		// Comentarios dos videos 
		Comments comments = new Comments();
		comments.setComment("Gostei do video!");
		System.out.println("-- Comentarios --");
		System.out.println(comments.getComment());
		System.out.println("");
		
		// Diario
		Diary diary1 = new Diary();
		diary1.setData(new Date());
		System.out.println("-- Diario --");
		System.out.println(diary1.getData());
		System.out.println("");
		
		//Videos motivacionais 
		MotivationVideos motivationVideos1 = new MotivationVideos();
		motivationVideos1.setCategory("Motivação Para Hoje");
		System.out.println("-- Videos --");
		System.out.println(motivationVideos1.getCategory());
		System.out.println("");
	}

}
