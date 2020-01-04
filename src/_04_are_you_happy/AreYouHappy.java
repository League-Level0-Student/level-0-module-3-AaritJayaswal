package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	
	public static void main(String[]args) {
	
		String q1 = JOptionPane.showInputDialog(null,"Are you happy?");
		
		if(q1.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing.");
			
		}
		else if (q1.equals("no")) {
			
			String q2 = JOptionPane.showInputDialog(null,"Do you want to be happy?");
if(q2.equals("no")) {
	JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing.");
}
else if (q2.contentEquals("yes")) {
	JOptionPane.showMessageDialog(null, "Change something.");
	
}
			
		}
		
		
		
	
	}

}
