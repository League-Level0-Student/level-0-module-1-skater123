package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String outOfOrder = JOptionPane.showInputDialog(" What has many keys but can’t open a single lock?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		if(outOfOrder.equals("Piano")) {
			JOptionPane.showMessageDialog(null,"My Boi!!!??");
				score = + 1;
			
		}else {
			JOptionPane.showMessageDialog(null,"Get outta here i dono you!!!!!");
		}
		

		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		String iop = JOptionPane.showInputDialog(" What room do ghosts avoid?");
		// 2. Make a pop up to show the score.
		if(iop.equals("The LivIng Room")) {
			JOptionPane.showMessageDialog(null,"My Boi!!!??");
				score = + 1;
				
		
	}else {
		JOptionPane.showMessageDialog(null,"Get outta here i dono you!!!!! you should have put a capital I !??!?!?!?!?1/");
				score = + 1;
	}
		
		
		
		
		
	}
}
