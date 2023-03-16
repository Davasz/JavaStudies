package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		String s = "bom dia X";
		s = s.replace("X", "senhora");
		
		s = s.toUpperCase();
		
		s = s.concat("!!!");
	
		System.out.println(s);
		
		System.out.println("oi".toUpperCase());
		
		String y = "bom dia X"
				.replace("X", "Alo")
				.toUpperCase();
		
		System.out.println(y);
	}
}
