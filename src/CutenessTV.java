import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	JButton duck = new JButton();
	JButton frog = new JButton();
	JButton unic = new JButton();

	public static void main(String[] args) {
		
		CutenessTV cn = new CutenessTV();
		cn.program();
	}
	
	private void program() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);	    
		panel.add(duck);
		panel.add(frog);
		panel.add(unic);	
		duck.setText("Play Duck Video");
		frog.setText("Play Frog Video");
		unic.setText("Play Unicorn Video");
		duck.addActionListener(this);
		frog.addActionListener(this);
		unic.addActionListener(this);
		frame.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == duck) {
			showDucks();
		}
		if(buttonPressed == frog) {
			showFrog();
		}
		if(buttonPressed == unic) {
			showFluffyUnicorns();
		}
	}
}
