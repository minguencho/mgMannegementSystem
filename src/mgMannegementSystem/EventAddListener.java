package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.DataFormatException;

import javax.swing.JTextField;

import mgMannegementSystem.Scheduler2;

public class EventAddListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldDate;
	JTextField fieldContent;
	Scheduler2 scheduler;
	
	public EventAddListener(
			JTextField fieldID,
			JTextField fieldName, 
			JTextField fieldDate, 
			JTextField fieldContent, Scheduler2 scheduler) {
		
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldDate = fieldDate;
		this.fieldContent = fieldContent;
		this.scheduler  = scheduler;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		EventInput event = new Assignment(Eventskind.Assignment);
		
		event.setEventnum(Integer.parseInt(fieldID.getText()));
		event.setEventname(fieldName.getText());
		event.setEventdate(fieldDate.getText());
		event.setEventcontent(fieldContent.getText());
		scheduler.addEvent(event);
		putObject(scheduler,"eventmanager.ser");
		event.printInfo();
	}
	
	public static void putObject(Scheduler2 scheduler, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(scheduler);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
