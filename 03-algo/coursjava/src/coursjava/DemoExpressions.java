package coursjava;

public class DemoExpressions {

	public DemoExpressions()
	{
		int a;
		int b;
		int c;
		//Boolean resultat;
		
		
		a = 1;
		b = a++; // b = a + 1;
		c = a++;
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		a = 0;
		
		while(a < 10) {
			System.out.println("a = " + ++a);
			a++;
		}
		
		
		
		//comment garder le reste d'une division dans un programme ?
		float x = 10;
		float y = 3;
		
		System.out.println(x / y - (int)x / (int)y); //sans modulo
		System.out.println(x % y); // avec modulo 
		System.out.println(x % 2 == 0); // avec modulo
		
		
	}
	
	
}
