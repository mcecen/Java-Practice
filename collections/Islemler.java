package collections;
import java.util.Scanner;


public class Islemler {
	
	public static Object dizi[][]=new Object[20][4];
	public static int i=0,j=0,t=0;
 
	public static void EKLE(){	
		if (i==20) {
			System.out.println("Liste Doldu");
		}
		else{
		Emlak aa=new Emlak();
		Scanner bilgi=new Scanner(System.in);
		System.out.print("Tür:");
		aa.setTur(bilgi.next());
		dizi[i][j]=aa.getTur();
		j++;
		System.out.print("Ýl:");
		aa.setIl(bilgi.next());
		dizi[i][j]=aa.getIl();
		j++;
		System.out.print("Oda Sayýsý:");
		aa.setOda(bilgi.nextInt());
		dizi[i][j]=aa.getOda();
		j++;
		System.out.print("Fiyatý:");
		aa.setFiyat(bilgi.nextDouble());
		dizi[i][j]=aa.getFiyat();
		j=0;i++;t=i;
		}
		
	}
	public static void LISTELE(){
		
		double toplam=0;
		if (t==0) 
		{
			System.out.println("Listelenecek emlak yok");
		}
		else{
			for (int i = 0; i < t; i++) 
			{
				for (int j = 0; j < 4; j++) 
				{
					System.out.print(dizi[i][j]);
					System.out.print(" ");
				
				
				}
			System.out.println("");
			toplam=toplam+Double.parseDouble(dizi[i][3].toString());
			}
		System.out.println("Emlak Sayýsý="+t);
		System.out.println("Toplam="+toplam);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("OMU Emlak Ltd. Þti'ye hoþgeldiniz");
		String komut="";
		Scanner bilgi=new Scanner(System.in);
		do {
			System.out.print("Komutu giriniz:");
			komut=bilgi.next();
			if (komut.equals("EKLE")) {
				EKLE();
			}
			else if (komut.equals("LISTELE")) {
				LISTELE();
			}
			else if (komut.equals("CIKIS")) {
			    System.out.println("Güle Güle");			
			}
			else{
				System.out.println("Hatalý bir komut girdiniz");
			}
			
		} while (komut.equals("CIKIS")==false);
		
		
	}
 
}
 
