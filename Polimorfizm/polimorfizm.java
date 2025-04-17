package Polimorfizm;

public class polimorfizm {
	public static void main(final String args[]) {
		final Calisan[] c = new Calisan[3];
		// c[0] = new Calisan(); // yukarý cevirim gerekmiyor
		c[0] = new Programci(); // yukarý cevirim (upcasting)
		c[1] = new Pazarlamaci(); // yukarý cevirim (upcasting)
		c[2] = new Mudur(); // yukarý cevirim (upcasting)
		mesaiBasla(c);
	}

	public static void mesaiBasla(final Calisan[] c) {
		for (int i = 0; i < c.length; i++)
			c[i].calis(); // !Dikkat!
	}
}
