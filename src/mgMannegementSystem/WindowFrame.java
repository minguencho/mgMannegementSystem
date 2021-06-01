package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mgMannegementSystem.Scheduler2;

public class WindowFrame extends JFrame{
	Scheduler2 scheduler;
	MenuSelection menuselection;
	EventsAdder eventadder;
	EventViewer EventViewer;
	public WindowFrame(Scheduler2 scheduler) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.scheduler = scheduler;
		menuselection = new MenuSelection(this);
		eventadder = new EventsAdder(this);
		EventViewer = new EventViewer(this, this.scheduler);
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public EventsAdder getEventadder() {
		return eventadder;
	}
	public void setEventadder(EventsAdder eventadder) {
		this.eventadder = eventadder;
	}
	public EventViewer getEventViewer() {
		return EventViewer;
	}
	public void setEventViewer(EventViewer eventViewer) {
		EventViewer = eventViewer;
	}

}
