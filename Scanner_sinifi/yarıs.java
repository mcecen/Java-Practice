package Scanner_sinifi;

import javax.swing.JOptionPane;

public class yar�s {
	public static void main(String[] args) {
		String[] dizi={"zentnli","salamal�","mantarl�"};
		String a=(String) JOptionPane.showInputDialog(null,"mesaj","bas��l",JOptionPane.CANCEL_OPTION,null, dizi, dizi[1]);
		JOptionPane.showMessageDialog( null, a+" pizza");
	}

}
