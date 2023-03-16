package fundamentos;

public class wrapper {
	public static void main(String[] args) {
		// byte
		Byte b = 100;
		Short s = 1000;
		
		s = 100;
		
		
		Integer i = 10000; //int 
		Long l = 100000L;
		
		int teste = 100;
		
		System.out.println(b.equals(s.byteValue()));
		System.out.println(s - teste);
		System.out.println(i.toString());
		System.out.println(l.floatValue());
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.9678;
		System.out.println(d.intValue());
		
		//boolean
		
		Boolean bo = true;
		System.out.println(bo.toString().toUpperCase());
		
		// Character
		
		Character c = '#';
		
		System.out.println(c.hashCode());
		
}
}
