package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Remarkable = "Awesome";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Adora = "Awesome Jacket";
		String Daniel = "Funny";
		String David = "Hilerious";
		String Matt = "Tall";
		String name = JOptionPane.showInputDialog("Enter a Name Dude");
		// 3. In a pop-up, tell the user what is remarkable about that person.

		if (name.equals("Daniel")) {
			JOptionPane.showMessageDialog(null, Daniel);
		}
		if (name.equals("Matt")) {
			JOptionPane.showMessageDialog(null, Matt);

		}
		if (name.equals("David")) {
			JOptionPane.showMessageDialog(null, David);

		}
		if(name.equals("Adora")) {  
			JOptionPane.showMessageDialog(null,Adora);
		}
		}
}