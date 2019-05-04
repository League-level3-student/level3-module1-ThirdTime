package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _02_LogSearch implements ActionListener {
	private HashMap<String, String> listOfStudents = new HashMap<>();
	String studentsAndIDs;

	// Main UI variables
	private JFrame mainUIFrame = new JFrame();
	private JPanel mainUIPanel = new JPanel();
	private JButton addEntryButton = new JButton();
	private JButton searchByIDButton = new JButton();
	private JButton viewListButton = new JButton();

	// Add an entry UI variables
	private JFrame addEntryUIFrame = new JFrame();
	private JPanel addEntryUIPanel = new JPanel();
	private JLabel IDLabel = new JLabel("ID: ");
	private JTextField IDTextField = new JTextField(15);
	private JLabel nameLabel = new JLabel("Name: ");
	private JTextField nameTextField = new JTextField(15);
	private JButton addNameAndIDButton = new JButton();

	// View list UI variables
	private JFrame viewListUIFrame = new JFrame();
	private JPanel viewListUIPanel = new JPanel();
	private JTextArea listOfStudentsTextArea = new JTextArea();
	
	public void createUI() {
		mainUIFrame.setVisible(true);
		mainUIFrame.add(mainUIPanel);
		mainUIPanel.add(addEntryButton);
		addEntryButton.addActionListener(this);
		mainUIPanel.add(searchByIDButton);
		searchByIDButton.setText("Search By ID");
		searchByIDButton.addActionListener(this);
		mainUIPanel.add(viewListButton);
		viewListButton.setText("View List");
		viewListButton.addActionListener(this);
		mainUIFrame.pack();
		mainUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addAddEntryUI() {
		addEntryUIFrame.setVisible(true);
		addEntryUIFrame.add(addEntryUIPanel);
		addEntryUIPanel.add(IDLabel);
		addEntryUIPanel.add(IDTextField);
		addEntryUIPanel.add(nameLabel);
		addEntryUIPanel.add(nameTextField);
		addEntryUIPanel.add(addNameAndIDButton);
		addNameAndIDButton.setText("Add Student");
		addNameAndIDButton.addActionListener(this);
		addEntryUIFrame.pack();
	}
	
	public void addViewListUI() {
		viewListUIFrame.setVisible(true);
		viewListUIFrame.add(viewListUIPanel);
		viewListUIPanel.add(listOfStudentsTextArea);
		listOfStudentsTextArea.setEditable(false);
		viewListUIFrame.pack();
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

		if (buttonClicked == addNameAndIDButton) {
			String id = IDTextField.getText();
			String name = nameTextField.getText();
			listOfStudents.put(id, name);
			IDTextField.setText(null);
			nameTextField.setText(null);
		}

		if (buttonClicked == searchByIDButton) {
			String idNum = JOptionPane.showInputDialog("Enter the ID of the student.");
			if (listOfStudents.containsKey(idNum) == false) {
				JOptionPane.showMessageDialog(null, "There is no student with that ID.");
			} else {
				JOptionPane.showMessageDialog(null, "The student with that ID is " + listOfStudents.get(idNum) + ".");
			}
		}

		if (buttonClicked == viewListButton) {
			for(String i: listOfStudents.keySet()) {
				listOfStudentsTextArea.setText(listOfStudentsTextArea.getText() + "ID: " + i + "\n" + "Student: " + listOfStudents.get(i) + "\n \n");
			}
			this.addViewListUI();
		}

	}

}
