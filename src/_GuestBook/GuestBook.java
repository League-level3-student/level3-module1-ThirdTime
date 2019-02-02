package _GuestBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class GuestBook implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel checkInText = new JLabel();
	JButton guestButton = new JButton();
	JButton VIPButton = new JButton();
	JTextField guestNameField = new JTextField(20);
	JButton seeAllButton = new JButton();
	
	ArrayList <Guest> guestList= new ArrayList <> ();

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		
		if(buttonPressed == guestButton) {
			RegularGuest regularGuest = new RegularGuest(guestNameField.getText());
			guestList.add(regularGuest);
			System.out.println(guestList);
		}
		
		if(buttonPressed == VIPButton) {
			VIPGuest vipGuest = new VIPGuest("VIP: " +guestNameField.getText());
			guestList.add(vipGuest);
			System.out.println(guestList);
		}
		
		if(buttonPressed == seeAllButton) {
			JOptionPane.showMessageDialog(null, "The guests checked in are: \n" + guestList);
		}

	}

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(300, 300);
		panel.add(checkInText);
		checkInText.setText("Welcome to the Hotel California! Please check in below.");
		panel.add(guestNameField);
		panel.add(seeAllButton);
		seeAllButton.setText("See All Guests");
		panel.add(guestButton);
		guestButton.setText("Add As Guest");
		panel.add(VIPButton);
		VIPButton.setText("Add As VIP");
		guestButton.addActionListener(this);
		VIPButton.addActionListener(this);
		seeAllButton.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		GuestBook guestbook = new GuestBook();
		guestbook.createUI();
	}
	
	public String buildNiceList(ArrayList list) {
		return "test";
		
	}
}
