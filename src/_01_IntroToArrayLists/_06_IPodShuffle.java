package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

//TO DO:
//get the shuffle button to shuffle and not play

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton shuffleButton = new JButton();
	JButton playButton = new JButton();
	
	 Song dramaticSong = new Song("ipod-dramatic.mp3");
	 Song sadSong = new Song("ipod-sad.mp3");
	 Song upbeatSong = new Song("ipod-upbeat.mp3");
	 Song yeehawSong = new Song("ipod-yeehaw.mp3");
	 
	ArrayList<Song> songsList = new ArrayList<>();
	
	Random rand = new Random();
	int randomNum = rand.nextInt(3);
	int currentSong;
	public _06_IPodShuffle() {
		

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	
		songsList.add(dramaticSong);
		songsList.add(sadSong);
		songsList.add(upbeatSong);
		songsList.add(yeehawSong);
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == playButton && playButton.getText().equals("PLAY")) {
			songsList.get(randomNum).play();
			playButton.setText("PAUSE");
		} else if(buttonPressed == playButton && playButton.getText().equals("PAUSE")) {
			songsList.get(randomNum).stop();
			playButton.setText("PLAY");
		}
		
		if(buttonPressed == shuffleButton) {	
			songsList.get(randomNum).stop();
			int randomNum = rand.nextInt(3);
			songsList.get(randomNum).play();
		}
	}
	
	
	
	public void createUI() {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(shuffleButton);
		shuffleButton.setText("SHUFFLE");
		shuffleButton.addActionListener(this);
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