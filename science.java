import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class science implements ActionListener{
	public static String[] scienceQuestion = { 
			"What is the atomic number of carbon",
			"What color do you get when you mix all the colors, White, black, or rainbow?:",
			"Does sound travel through air or water faster?:",
			"Is a tomato a fruit or vegetable" };
	public static String[] scienceAnswer = { 
			"12",
			"White",
			"Water",
			"Fruit" };

	static int num;
	JTextField field;
	public science () {
		JFrame pan = new JFrame();
		pan.setBounds(350,200,400, 400);
		field = new JTextField (scienceQuestion() + "\n", 10);
		pan.add(field);
		pan.setVisible(true);
		field.addActionListener(this);
		
		}

	public static String scienceQuestion() {
		Scanner s = new Scanner(System.in);
		int whQuestion = getRandomNumber(0, 2);
		return scienceQuestion[whQuestion];
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
		if (txt.equals(scienceAnswer[num])) {
			JOptionPane.showMessageDialog(field, "correct");
			
		}
		else {
			JOptionPane.showMessageDialog(field, "wrong");
		}
	}
	


}