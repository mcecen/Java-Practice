package Scanner_sinifi;

import javax.swing.JOptionPane;

public class yarýs {
	public static void main(String[] args) {
		String[] dizi={"zentnli","salamalý","mantarlý"};
		String a=(String) JOptionPane.showInputDialog(null,"mesaj","basþýl",JOptionPane.CANCEL_OPTION,null, dizi, dizi[1]);
		JOptionPane.showMessageDialog( null, a+" pizza");
	}

}
