package finalParametre;

public class finalParameter {
	public static void main(final String arg[]) {
		if (arg.length != 2) {
			System.out.println("eksik veri");
			System.exit(-1);
		}

		final int a = Integer.parseInt(arg[0]);
		final int b = Integer.parseInt(arg[1]);
		final int sonuc = finalParameter.topla(a, b);
		System.out.println("Sonuç = " + sonuc);
	}

	public static int topla(final int a, final int b) {
		return a + b;
	}
}
