package singleton;

public class Singleton {
	
	private volatile static Singleton instanciaUnica;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getSingleton() {
		if(instanciaUnica == null) {
			instanciaUnica = new Singleton();
		}
		return instanciaUnica;
	}
	public static void main(String []args) {
		Singleton a = getSingleton();
		Singleton b = getSingleton();
		System.out.println("A = " + a + " " +"B = " + b);
	}
	
}
