import javax.swing.JOptionPane;

public class Addition {

	public Addition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first=JOptionPane.showInputDialog("Dwse ton prwto arithmo re");
		String second=JOptionPane.showInputDialog("Dwse ton deytero arithmo kale");
		int prwtos = Integer.parseInt(first);
		int deyteros = Integer.parseInt(second);
		int sum = prwtos + deyteros;
		JOptionPane.showMessageDialog(null, "To apotelesma einai " + sum, "Apotelesma", JOptionPane.PLAIN_MESSAGE);
	}

}
