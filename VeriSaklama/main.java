package VeriSaklama;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Dikdortgen dik = new Dikdortgen(); //yapýlandýrýcý için parametre gönder.
		//System.out.println(dik.Alan());
		Scanner sc=new Scanner(System.in);
		System.out.println("Dikdörtgenin Eni : ");
		dik.setEn(sc.nextDouble());
		System.out.println("Dikdörtgenin Boyu: ");
		dik.setBoy(sc.nextDouble());
		System.out.println("Dikdörtgenin Alaný = " + dik.Alan()); 
	}

}
