package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _02_LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	//Main UI variables
	JFrame mainUIFrame = new JFrame();
	JPanel mainUIPanel = new JPanel();
	JButton addEntryButton = new JButton();
	JButton searchByIDButton = new JButton();
	JButton viewListButton = new JButton();
	
	//Add an entry UI variables
	JFrame addEntryUIFrame = new JFrame();
	JPanel addEntryUIPanel = new JPanel();
	JLabel IDLabel = new JLabel();
	JTextField IDTextField = new JTextField(15);
	JLabel nameLabel = new JLabel();
	JTextField nameTextField = new JTextField(15);
	JButton addNewEntryButton = new JButton();
	
	
	public void createUI() {
		mainUIFrame.setVisible(true);
		mainUIFrame.add(mainUIPanel);
		mainUIFrame.setSize(150, 150);
		mainUIPanel.add(addEntryButton);
		addEntryButton.setText("Add an Entry");
		addEntryButton.addActionListener(this);
		mainUIPanel.add(searchByIDButton);
		searchByIDButton.setText("Search By ID");
		mainUIPanel.add(viewListButton);
		viewListButton.setText("View List");
		mainUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addAddEntryUI() {
		addEntryUIFrame.setVisible(true);
		addEntryUIFrame.add(addEntryUIPanel);
		addEntryUIFrame.setSize(400, 100);
		addEntryUIPanel.add(IDTextField);
		addEntryUIPanel.add(addNewEntryButton);
		addNewEntryButton.setText("Add");
		addNewEntryButton.addActionListener(this);
		addEntryUIPanel.add(nameTextField);
		addEntryUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		_02_LogSearch thisClass = new _02_LogSearch();
		thisClass.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == addEntryButton) {
			this.addAddEntryUI();
		}
		
	}
	
	
	
}
