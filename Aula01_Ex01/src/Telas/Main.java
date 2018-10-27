package Telas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Usuario;

public class Main {
	
	private static Integer maioridade;
	private static Integer medidade = 0;

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		ArrayList <Usuario> Lista_Usuario = new ArrayList <Usuario> ();
		
		
		for(int i = 0; i < 3  ; i++) {
			
			Usuario user = new Usuario();
			
			System.out.println("Nome:");
			user.setNome(input.nextLine());
			
			System.out.println("Sexo:");
			user.setSexo(input.nextLine());
			
			System.out.println("Idade:");
			user.setIdade(input.nextInt());
			
			input.nextLine();
			
			Lista_Usuario.add(user);
	
		}
		
		maioridade = Lista_Usuario.get(0).getIdade();
		
		for(int i = 0; i< Lista_Usuario.size(); i++) {
			
			medidade = Lista_Usuario.get(i).getIdade() + medidade;
			
			if(Lista_Usuario.get(i).getIdade()> maioridade) {
				maioridade = Lista_Usuario.get(i).getIdade();
			}
		}
		
		for(int i = 0; i< Lista_Usuario.size(); i++) {
			System.out.println(Lista_Usuario.get(i).getNome());
			System.out.println(Lista_Usuario.get(i).getIdade());
			System.out.println(Lista_Usuario.get(i).getSexo());
		
		}
	
			System.out.println(medidade/3);
			System.out.println(maioridade);
		
		
	}

}
