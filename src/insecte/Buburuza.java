package insecte;

public class Buburuza extends Insecta {
	private int b = printInit("Buburuza.b initializat");

	public Buburuza() {
		System.out.println("k = " + b);
		System.out.println("j = " + j);
	}

	private static int x3 = printInit("static Buburuza.x2 initializat");
}
