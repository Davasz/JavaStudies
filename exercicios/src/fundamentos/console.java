package fundamentos;


import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		int year = 2023;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite seu ano de nascimento");
		int date = entrada.nextInt();
		
		int idade = year - date;
		
		System.out.printf("Nome: %s %s \nIdade: %d anos", nome, sobrenome, idade);
		
		entrada.close();
	}
}
