package calisma;

import java.io.File;

public class file_islemleri {

	public static void main(final String[] args) {
		final File f1 = new File(
				"/DERSLER/bilgisayar kitaplarý/BÝLGÝSAYAR ÜZERÝNE HERÞEY/BÝLGÝSAYAR ÜZERÝNE HERÞEY.doc");
		p("File name:" + f1.getName());
		p("Path:" + f1.getAbsolutePath());
		p(f1.exists() ? "e" : "not e");
		p(f1.canWrite() ? "yes w" : "no w");
	}

	private static void p(final String string) {
		System.out.println(string);

	}

}
