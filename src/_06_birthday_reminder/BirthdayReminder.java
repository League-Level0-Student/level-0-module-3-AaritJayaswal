
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 14th";
		String dadsBirthday = "February 1st";
		String myBirthday = "July 15th";
		String sistersBirthday= "April 25th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog(null,"Who's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(bday);
		// 4. if user asked for "mom"
if (bday.contentEquals("mom")) {
	JOptionPane.showMessageDialog(null,momsBirthday);
	 System.exit(0);
}
		//print mom's birthday
		// 5. if user asked for "dad"
else if (bday.contentEquals("dad")) {
	JOptionPane.showMessageDialog(null,dadsBirthday);
	 System.exit(0);
}

// print dad's birthday
		// 6. if user asked for your name
		
else if (bday.contentEquals("Aarit")) {
	JOptionPane.showMessageDialog(null,myBirthday);
	 System.exit(0);
}

else if (bday.contentEquals("Shaina")) {
	JOptionPane.showMessageDialog(null,sistersBirthday);
	 System.exit(0);
}

// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
else {
	
	JOptionPane.showMessageDialog(null,"I don't remember that person's birthday");
}
	} 
}
