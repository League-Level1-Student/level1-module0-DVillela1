import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects {

	public static void main(String[] args) {
	
		SoundEffects se = new SoundEffects();
		se.createGui();
	}
	private void createGui() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		JButton dh = new JButton("Dixie Horn");
		JButton wd = new JButton("Water Drop");
		JButton pw = new JButton("Police Whistle");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
