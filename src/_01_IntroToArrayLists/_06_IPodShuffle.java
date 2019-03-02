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
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton playButton = new JButton();
	private final String PLAY_TEXT = "PLAY";
	private final String PAUSE_TEXT = "STOP";

	ArrayList<Song> songsList = new ArrayList<>();

	private Random rand = new Random();
	private int randomNum;
	private int currentSong;

	public _06_IPodShuffle() {

	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == playButton && playButton.getText().equals(PLAY_TEXT)) {
			randomNum = getNewRandomNum();
			songsList.get(randomNum).play();
			playButton.setText(PAUSE_TEXT);
		} else if (buttonPressed == playButton && playButton.getText().equals(PAUSE_TEXT)) {
			songsList.get(randomNum).stop();
			playButton.setText(PLAY_TEXT);
		}
	}

	private int getNewRandomNum() {
		int temporaryRandomNum = rand.nextInt(songsList.size());
		while (temporaryRandomNum == randomNum) {
			temporaryRandomNum = rand.nextInt(songsList.size());
		}
		return temporaryRandomNum;
	}

	public void addSongs() {
		songsList.add(new Song("ipod-dramatic.mp3"));
		songsList.add(new Song("ipod-sad.mp3"));
		songsList.add(new Song("ipod-upbeat.mp3"));
		songsList.add(new Song("ipod-yeehaw.mp3"));
	}

	public void createUI() {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(playButton);
		playButton.setText(PLAY_TEXT);
		playButton.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		_06_IPodShuffle thisClass = new _06_IPodShuffle();
		thisClass.addSongs();
		thisClass.createUI();
	}

}