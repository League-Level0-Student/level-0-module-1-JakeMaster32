package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Jake = "superspeed";
String Misha = "Flight";
String Auggie = "Strength";
String Asher = "Invisibility";
String Daniel = "Mind Control";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String x = (JOptionPane.showInputDialog("Type in your name"));
if (x.equals("Jake")){JOptionPane.showMessageDialog(null, "Superspeed");}else
if (x.equals("Misha")){JOptionPane.showMessageDialog(null, "Flight");}else
if (x.equals("Auggie")){JOptionPane.showMessageDialog(null, "Strength");}else
if (x.equals("Asher")){JOptionPane.showMessageDialog(null, "Invisibility");}else
if (x.equals("Daniel")){JOptionPane.showMessageDialog(null, "Mind control");}
		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}

