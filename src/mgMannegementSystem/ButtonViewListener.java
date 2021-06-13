package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.EventViewer;
import GUI.WindowFrame;
import mgMannegementSystem.Scheduler2;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		EventViewer eventviewer = frame.getEventViewer();
		Scheduler2 scheduler = getObject("eventmanager.ser");
		eventviewer.setScheduler(scheduler);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(eventviewer);
		frame.revalidate();
		frame.repaint();
		/*
		JButton b = (JButton) e.getSource();	
		EventViewer viewer = frame.getEventViewer();
		frame.setupPanel(viewer);
		*/
	}
	public static Scheduler2 getObject(String filename) {
		Scheduler2 scheduler = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			
			ObjectInputStream in = new ObjectInputStream(file);
			
			scheduler = (Scheduler2) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return scheduler;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scheduler;
	}

}
