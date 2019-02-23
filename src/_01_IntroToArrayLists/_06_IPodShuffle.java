package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton playButton = new JButton();

	ArrayList<Song> songsList = new ArrayList<>();

	Random rand = new Random();
	int randomNum;
	int currentSong;

	public _06_IPodShuffle() {
		songsList.add(new Song("ipod-dramatic.mp3"));
		songsList.add(new Song("ipod-sad.mp3"));
		songsList.add(new Song("ipod-upbeat.mp3"));
		songsList.add(new Song("ipod-yeehaw.mp3"));
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == playButton && playButton.getText().equals("PLAY")) {
			setNewRandomNum();
			songsList.get(randomNum).play();
			playButton.setText("STOP");
		} else if (buttonPressed == playButton && playButton.getText().equals("STOP")) {
			songsList.get(randomNum).stop();
			playButton.setText("PLAY");
		}
	}

	public void setNewRandomNum() {
		int temporaryRandomNum = rand.nextInt(4);
		while (temporaryRandomNum == randomNum) {
			temporaryRandomNum = rand.nextInt(4);
		}
		randomNum = temporaryRandomNum;
	}

	public void createUI() {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(playButton);
		playButton.setText("PLAY");
		playButton.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_06_IPodShuffle thisClass = new _06_IPodShuffle();
		thisClass.createUI();
	}

}