import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	Random rand = new Random();
    

public static void main(String[] args) {
	
	FortuneCookie fc = new FortuneCookie();
	
	fc.showButton();	
}

public void showButton() {
    frame.setVisible(true);
    frame.add(button);
    button.addActionListener(this);
    button.setText("Fortune Generator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int r = rand.nextInt(5);
	if (r == 0) {
		JOptionPane.showMessageDialog(null, "Your past success will be overshadowed by your future success.");
	}
	if (r == 1) {
		JOptionPane.showMessageDialog(null, "Your happiness is intertwined with your outlook on life.");
	}
	if (r == 2) {
		JOptionPane.showMessageDialog(null, "Grand adventures await those who are willing to turn the corner.");
	}
	if (r == 3) {
		JOptionPane.showMessageDialog(null, "None of the secrets of success will work unless you do.");
	}
	if (r == 4) {
		JOptionPane.showMessageDialog(null, "The secret of getting ahead is getting started.");
	}
}

}
