package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwsome {
public static void main(String[] args) {
	String response=JOptionPane.showInputDialog("Hey!What is your favorite videogame?");
	JOptionPane.showMessageDialog(null, ""+response+" is AWSOME!!!");
}
}
