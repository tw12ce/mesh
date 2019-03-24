
import java.util.Scanner;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class history extends JTextField implements ActionListener{
	static int num;
	JTextField field;
	public history () {
		JFrame pan = new JFrame();
		pan.setBounds(350,200,400, 400);
		field = new JTextField (historyQuestion() + "\n", 10);
		pan.add(field);
		pan.setVisible(true);
		field.addActionListener(this);
		
		}
	public static String[] historyQuestion = { 
			"Who \"Discovered\" america? (First name only)",
			"What year did the titanic sink?",
			"What year was Abraham Lincoln assasinated?",
			"When did the colonists come to America?" };
	public static String[] historyAnswer = { 
			"Christopher",
			"1912", 
			"1865", 
			"1607" };

	public static String historyQuestion() {
		Scanner s = new Scanner(System.in);
		int whQuestion = getRandomNumber(0, 2);
		return historyQuestion[whQuestion];
	}

	private static int getRandomNumber(double min, double max) {
		double x = (Math.random() * ((max - min) + 1)) + min;
		int ix = (int) Math.round(x);
		num = ix;
		return ix;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String txt = field.getText();
		txt = txt.substring(txt.lastIndexOf(" ") + 1);
		if (txt.equals(historyAnswer[num])) {
			JOptionPane.showMessageDialog(field, "correct");
			
		}
		else {
			JOptionPane.showMessageDialog(field, "wrong");
		}
	}
	

}