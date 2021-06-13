package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Event.EventAddListener;
import Listener.EventAdderCancelListener;
import mgMannegementSystem.Scheduler2;

public class EventsAdder extends JPanel {
		WindowFrame frame;
		Scheduler2 scheduler;
		
		public EventsAdder(WindowFrame frame, Scheduler2 scheduler) {
			this.frame = frame;
			this.scheduler = scheduler;
			
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
			
			JButton saveButton = new JButton("save");
			saveButton.addActionListener(new EventAddListener(feildID, feildName, feildDate, feildContent, scheduler));
			JButton cancelButton = new JButton("cancel");
			cancelButton.addActionListener(new EventAdderCancelListener(frame));
			
			panel.add(saveButton);
			panel.add(cancelButton);
			
			SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
			
			this.add(panel);
			this.setVisible(true);
		}
	}
