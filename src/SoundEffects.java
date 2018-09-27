import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {

		JButton dr = new JButton("Drum");
		JButton cy = new JButton("Cymbal");
		JButton sn = new JButton("Snare");
		
	public static void main(String[] args) {
	
		SoundEffects se = new SoundEffects();
		se.createGui();
	}
	private void createGui() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);	    

		panel.add(dr);
		panel.add(cy);
		panel.add(sn);		
		dr.addActionListener(this);
		cy.addActionListener(this);
		sn.addActionListener(this);
		frame.pack();
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == dr) {
			playSound("drum.wav");
		}
		if(buttonPressed == cy) {
			playSound("cymbal.wav");
		}
		if(buttonPressed == sn) {
			playSound("snare.wav");
		}
		
	}
}
