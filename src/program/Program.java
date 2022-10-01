package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso?: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			
			
			System.out.println("Dadods da " + i + "° aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'c') {
				
				sc.nextLine();
				System.out.print("Título: ");
				String title = sc.nextLine();
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");				
				int seconds = sc.nextInt();
				
				list.add(new Video(url, seconds));
			}
			else {
				sc.nextLine();
				System.out.print("Título: ");
				String title = sc.nextLine();
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				
				list.add(new Task(description, questionCount));				
			}
			
							
		}
		
		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO: ");
		for (Lesson lesson : list) {				
			System.out.println(lesson.duration());
		}
		
		
		sc.close();
	}

}
