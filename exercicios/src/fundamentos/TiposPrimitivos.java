package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do usuário
		
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Numericos Flutuantes 
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano
		
		boolean estaFerias = false; //true
		
		//Tipo caractere
		
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosEmpresa * 365);
		
		//Numeros de viagens
		System.out.println(numeroVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha =>" + salario);
		System.out.println("Ferias? " + estaFerias);
		System.out.println("Status: " + status);
	}
}
