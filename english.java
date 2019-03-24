import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class english implements ActionListener {
	public static String[] englishQuestion = { 
			"Who wrote Romeo and Juliet? (What he is mostly called)",
			"Who wrote Harry Potter?",
			"Who said the quote, \"Stay hungry, Stay foolish\"?",
			"Who is the author of To Kill a Mockingbird?" };
	public static String[] englishAnswer = { 
			"Shakespear", 
			"J.K Rowling", 
			"Steve Jobs", 
			"Harper Lee" };

	static int num;
	JTextField field;
	public english () {
		JFrame pan = new JFrame();
		pan.setBounds(350,200,400, 400);
		field = new JTextField (englishQuestion() + "\n", 10);
		pan.add(field);
		pan.setVisible(true);
		field.addActionListener(this);
		
		}

	public static String englishQuestion() {
		Scanner s = new Scanner(System.in);
		int whQuestion = getRandomNumber(0, 2);
		return englishQuestion[whQuestion];
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
		if (txt.equals(englishAnswer[num])) {
			JOptionPane.showMessageDialog(field, "correct");
			
		}
		else {
			JOptionPane.showMessageDialog(field, "wrong");
		}
	}
	


}