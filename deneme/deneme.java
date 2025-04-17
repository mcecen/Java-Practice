package deneme;
class Foo {
	public String toString() {
		double x = Math.random() * 10;
		return "x= " + x;
	}
}
public class deneme {
	public static void main(String[] args) {
		int i = 25;
		System.out.println(i);
		iMethod(i);
		System.out.println(i);
		Foo foo = new Foo();
		System.out.println(foo.toString());
		fooMethod(foo);
		System.out.println(foo.toString());
	}
	public static void iMethod(int i) {
		i = 9;
		System.out.println(i);
	}
	public static void fooMethod(Foo foo) {
		foo.toString();
		System.out.println(foo.toString());
	}
}