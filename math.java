import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class math implements ActionListener {
	public static String[] mathQuestion = { "What is the square root of 121",
			"What is the length of the hypotenuse if the sin of the smallest angle is 3/9:", "9 to the power of 9:",
			"What is 3 times 29" };
	public static String[] mathAnswer = { "11", "9", "387420489", "87" };

	static int num;
	JTextField field;

	public math() {
		JFrame pan = new JFrame();
		pan.setBounds(350, 200, 400, 400);
		field = new JTextField(mathQuestion() + "\n", 10);
		pan.add(field);
		pan.setVisible(true);
		field.addActionListener(this);

	}

	public static String mathQuestion() {
		Scanner s = new Scanner(System.in);
		int whQuestion = getRandomNumber(0, 2);
		return mathQuestion[whQuestion];
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
		if (txt.equals(mathAnswer[num])) {
			JOptionPane.showMessageDialog(field, "correct");

		} else {
			JOptionPane.showMessageDialog(field, "wrong");
		}
	}

}