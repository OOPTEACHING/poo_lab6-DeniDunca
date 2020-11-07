package insecte;

public class Gandac extends Insecta {
	private int k = printInit("Gandac.k initializat");

	public Gandac() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int x2 = printInit("static Gandac.x2 initializat");

}
