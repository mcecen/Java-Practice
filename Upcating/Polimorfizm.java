package Upcating;

public class Polimorfizm {

	public static String hazir() {
		return "";
	}

	public static void hazirol(final Asker a) {
		a.selamVer();
	}

	public static void main(final String[] args) {
		final Asker a = new Asker();
		final Er e = new Er();
		final Yuzbasi y = new Yuzbasi();
		hazirol(a);
		hazirol(e);
		hazirol(y);
	}
}
