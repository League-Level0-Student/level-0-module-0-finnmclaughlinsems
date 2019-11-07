package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String response=JOptionPane.showInputDialog("Hi!What is your name?");
		JOptionPane.showMessageDialog(null, "Well "+response+", nice to meet you.");
	
	
}
}
