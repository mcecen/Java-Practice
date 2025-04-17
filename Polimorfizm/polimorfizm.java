package Polimorfizm;

public class polimorfizm {
	public static void main(final String args[]) {
		final Calisan[] c = new Calisan[3];
		// c[0] = new Calisan(); // yukar� cevirim gerekmiyor
		c[0] = new Programci(); // yukar� cevirim (upcasting)
		c[1] = new Pazarlamaci(); // yukar� cevirim (upcasting)
		c[2] = new Mudur(); // yukar� cevirim (upcasting)
		mesaiBasla(c);
	}

	public static void mesaiBasla(final Calisan[] c) {
		for (int i = 0; i < c.length; i++)
			c[i].calis(); // !Dikkat!
	}
}
