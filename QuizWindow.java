import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

public class QuizWindow extends JFrame implements ActionListener{
	private JButton bt, bt1, bt3, bt4;
	private JFrame frame;
	public static void main (String [] args) {
		QuizWindow quiz = new QuizWindow();
	}
	public QuizWindow() {
		frame = new JFrame("Quiz");
		frame.setBounds(350,200,800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt = new JButton("History");
		bt.addActionListener(this);
		bt1 = new JButton("Math");
		bt1.addActionListener (this);
		bt3 = new JButton("Science");
		bt3.addActionListener(this);
		bt4 = new JButton("English");
		bt4.addActionListener(this);
		bt.setBounds(0, 0, 399, 399);
		frame.add(bt);

		bt1.setBounds(0, 400, 399, 399);
		frame.add(bt1);
		bt3.setBounds(400, 0, 399, 399);
		frame.add(bt3);

		bt4.setBounds(400, 400, 399, 399);
		frame.add(bt4);
		JButton bt5 = new JButton(" ");
		frame.add(bt5);
		bt5.setBackground(Color.blue);
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b == bt) {
			history hi = new history();
		}
		else if (b == bt1) {
			math hi = new math();
		}
		else if (b == bt3) {
			science hi = new science();
		}
		else{
			english hi = new english();
		}
	}

}