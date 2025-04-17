package yapılandırıcı_kalıtım;

public class Hacker extends ZekiInsan{
	public Hacker (int par) {
		super(par+1);
		System.out.println("Hacker Yapilandiricisi " + par);
	}
	public static void main(String[] args) {
		Hacker hck = new Hacker(2);
	}
}
