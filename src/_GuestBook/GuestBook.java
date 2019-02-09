package _GuestBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();
	private JLabel checkInText = new JLabel();
	private JButton guestButton = new JButton();
	private JButton VIPButton = new JButton();
	private JTextField guestNameField = new JTextField(20);
	private JButton seeAllButton = new JButton();
	
	ArrayList <Guest> guestList= new ArrayList <> ();

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		
		if(buttonPressed == guestButton) {
			RegularGuest regularGuest = new RegularGuest(guestNameField.getText());
			guestList.add(regularGuest);
		}
		
		if(buttonPressed == VIPButton) {
			VIPGuest vipGuest = new VIPGuest(guestNameField.getText());
			guestList.add(vipGuest);
		}
		
		if(buttonPressed == seeAllButton) {
			JOptionPane.showMessageDialog(null, "The guests checked in are: \n" + buildNiceList(guestList));
		}

	}

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(400, 200);
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
	
	public String buildNiceList(ArrayList<Guest> list) {
		String niceList = "";
		for(int i = 0; i < list.size(); i++) {
			niceList = niceList + list.get(i).getListing() + "\n";
		}
		return niceList;
	}
}
