package singleton;

public class Singleton {
	
	private static Singleton instanciaUnica;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		if(instanciaUnica == null) {
			instanciaUnica = new Singleton();
		}
		return instanciaUnica;
	}
	public static void main(String []args) {
		Singleton a = getSingleton();
		Singleton b = getSingleton();
		System.out.println(a + "-" + b);
	}
	
}
