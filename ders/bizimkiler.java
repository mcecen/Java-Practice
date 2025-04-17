package ders;
class Veriler{
	double kilo;
	double boy;
}

class Hesapla{
	static double vke(Veriler eren){
		return eren.kilo/(eren.boy*eren.boy);
	}
	static void emre(){
		System.out.println("Salih Can");
	}
}
public class bizimkiler {
	public static void main(String[] args) {
		Veriler v=new Veriler();
		//Hesapla h=new Hesapla();
		v.boy=1.84;
		v.kilo=90;
		
		double vkw;
		vkw= Hesapla.vke(v);
		System.out.println(vkw);
		Hesapla.emre();
	}

}
