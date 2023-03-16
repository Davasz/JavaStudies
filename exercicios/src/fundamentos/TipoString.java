package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoas".charAt(2));
		
		String s = "boa tarde";
		System.out.println(s.concat("!!!"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 38;
		var salario = 12345.678;
		
		System.out.printf("O senhor %s %s tem %d e"
				+ "recebe R$ %.3f", nome, sobrenome, idade, salario);
	

	}
}
