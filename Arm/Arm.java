package Arm;

public class Arm {
	public static void main(String[] args) {
		int a = 0,b,c,sayi,i;
		for ( i=100; i<=999; i++ ){
			a=i/100;
			b=(i/10)%10;
			c=i%10;
			sayi=(a*a*a)+(b*b*b)+(c*c*c);
			if(i==sayi)
				System.out.println(sayi);
		}
	}

}
