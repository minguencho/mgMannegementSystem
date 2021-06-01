package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Event.EventInput;
import mgMannegementSystem.Scheduler2;

public class EventViewer extends JPanel {
	
	WindowFrame frame;
	
	Scheduler2 scheduler;
	
	public EventViewer(WindowFrame frame,Scheduler2 scheduler) {
		this.frame = frame;
		this.scheduler = scheduler;
		System.out.println("**"+scheduler.size() + "**");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("Name");
		model.addColumn("Date");
		model.addColumn("Content");
		for(int i= 0; i<scheduler.size(); i++) {
			Vector row = new Vector();
			EventInput ei = scheduler.get(i);
			row.add(ei.getEventnum());
			row.add(ei.getEventname());
			row.add(ei.getEventdate());
			row.add(ei.getEventcontent());
			row.add(ei.getdeadline());
			model.addRow(row);
		}
		JTable table = new JTable(model);;
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
