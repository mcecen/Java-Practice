package Scanner_sinifi;

import java.util.Random;

import javax.swing.JOptionPane;

public class randoom {

	public static void main(String[] args) {
		int sayac=0;
			
		    Random rast =new Random();
		    int k = rast.nextInt(10);
		    while(true){
		    	//System.out.println("Tam sayi gir: ");
		    	String oku=JOptionPane.showInputDialog("Sayý gir");
			    int a = Integer.parseInt(oku);
			    if(a>10){
			    	System.out.println("10 dan küçük gir ");
			    	continue;
			    }
			    if(k==a){
			    	JOptionPane.showMessageDialog( null, sayac+1+".sefer");
			    	System.out.println(sayac+1+".seferde");
			    	break;
			    }
			    else{
			    	sayac+=1;
			    }
		    }
	}
}


