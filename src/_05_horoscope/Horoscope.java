package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[]args) {
		

//1.Ask the user for their star sign.
	String starSign = JOptionPane.showInputDialog(null,"What is your star sign?");
		
				
//2.Depending on what they answer, tell them their horoscope
if (starSign.equals("Aries")){
	JOptionPane.showMessageDialog(null,"You will make a new friend");
}
else if (starSign.equals("Taurus")){
	JOptionPane.showMessageDialog(null,"You will become very rich");
}
else if (starSign.equals("Gemini")){
	JOptionPane.showMessageDialog(null,"Your friends will leave you");
}
else if (starSign.equals("Cancer")){
	JOptionPane.showMessageDialog(null,"Something very lucky will happen to you");
}
else if (starSign.equals("Leo")){
	JOptionPane.showMessageDialog(null,"You will set a new personal record");
}
else if (starSign.equals("Virgo")){
	JOptionPane.showMessageDialog(null,"You will lose all of your money");
}
else if (starSign.equals("Libra")){
	JOptionPane.showMessageDialog(null,"You will buy plants");
}
else if (starSign.equals("Scorpio")){
	JOptionPane.showMessageDialog(null,"You will do something good for the world");
}
else if (starSign.equals("Sagittarius")){
	JOptionPane.showMessageDialog(null,"You will become famous");
}
else if (starSign.equals("Capricorn")){
	JOptionPane.showMessageDialog(null,"You will persevere through all of your challenges");
}
else if (starSign.equals("Aquarius")){
	JOptionPane.showMessageDialog(null,"You will get hurt");
}
else if (starSign.equals("Pisces")){
	JOptionPane.showMessageDialog(null,"You will eat some very tasty food");
}

//3.If they enter something else, tell them "That's not a star sign!"	
		
else {
	
	JOptionPane.showMessageDialog(null,"That's not a star sign!");
}
		
		
		
		
	}
	
}
