package VeriSaklama;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Dikdortgen dik = new Dikdortgen(); //yap�land�r�c� i�in parametre g�nder.
		//System.out.println(dik.Alan());
		Scanner sc=new Scanner(System.in);
		System.out.println("Dikd�rtgenin Eni : ");
		dik.setEn(sc.nextDouble());
		System.out.println("Dikd�rtgenin Boyu: ");
		dik.setBoy(sc.nextDouble());
		System.out.println("Dikd�rtgenin Alan� = " + dik.Alan()); 
	}

}
