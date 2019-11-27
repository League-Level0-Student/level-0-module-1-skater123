import javax.swing.JOptionPane;

public class UnBirthDay {
	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog("WHAT IS YOR BIRTHDAY?!?!?");
	
		if (birthday.equals("11/26")) {
			JOptionPane.showMessageDialog(null, "Happy  birth day");		
		}else {
			
		JOptionPane.showMessageDialog(null,"happy un birthday");	
		}	
		}	
}