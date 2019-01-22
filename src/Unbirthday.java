import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = (JOptionPane.showInputDialog("Give me your birth month and day ex. Jun. 8"));
		if (x.equals("Jan. 21")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!!!");
		} else
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");

	}

}
