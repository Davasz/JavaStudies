package fundamentos;

public class ConversãoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.123214218888; // float b = 1.0F; 
											//explicita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // Converte pro proximo valor da sequencia
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}
