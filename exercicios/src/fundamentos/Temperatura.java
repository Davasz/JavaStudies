package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double FareTemp = 86;
		final double Const = 32;
		final double ConstMult = 5/9.0;
		
		double celc = (FareTemp - Const) * ConstMult;
		
		System.out.println(celc);
	}
}
