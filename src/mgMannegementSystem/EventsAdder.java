package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class EventsAdder extends JPanel {
	
	WindowFrame frame;
	
	public EventsAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID  = new JLabel("Eventnumber : ", JLabel.TRAILING);
		JTextField feildID = new JTextField(10);
		labelID.setLabelFor(feildID);
		panel.add(labelID);
		panel.add(feildID);
		
		JLabel labelName  = new JLabel("Name : ", JLabel.TRAILING);
		JTextField feildName = new JTextField(10);
		labelName.setLabelFor(feildName);
		panel.add(labelName);
		panel.add(feildName);
		
		JLabel labelDate  = new JLabel("Date : ", JLabel.TRAILING);
		JTextField feildDate = new JTextField(10);
		labelDate.setLabelFor(feildDate);
		panel.add(labelDate);
		panel.add(feildDate);
		
		JLabel labelContent  = new JLabel("Content : ", JLabel.TRAILING);
		JTextField feildContent = new JTextField(10);
		labelContent.setLabelFor(feildContent);
		panel.add(labelContent);
		panel.add(feildContent);
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		this.add(panel);
		this.setVisible(true);
	}
}
