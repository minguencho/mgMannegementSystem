package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.EventViewer;
import GUI.EventsAdder;
import GUI.WindowFrame;

public class EventAdderCancelListener implements ActionListener {

	WindowFrame frame;
	
	public EventAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
