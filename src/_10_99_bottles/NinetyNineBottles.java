package _10_99_bottles;

import javax.swing.JOptionPane;

public class NinetyNineBottles {

	
	public static void main(String[] args) {
		
		
		String b =  " bottles of beer on the wall, ";
		String bb = " bottles of beer.";
		String bbb= "Take one down and pass it around, ";
		
		for (int i = 99; i > 1; i--) {
			
		JOptionPane.showMessageDialog(null, i + b + i+ bb + bbb + (i - 1)  + b + (i - 1) +bb );	
			
			
		}
		
		JOptionPane.showMessageDialog(null," 1 bottle of beer on the wall, 1 bottle of beer. "
		+ "Take one down and pass it around, no more"+ b +" no more"+ bb);
		JOptionPane.showMessageDialog(null,"No more" + b+" no more"+ bb+" Go to the store and buy some more, 99 " +bb);
		
	}
	
}
