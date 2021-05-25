package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EventViewer extends JFrame {
	public EventViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("Name");
		model.addColumn("Date");
		model.addColumn("Content");

		JTable table = new JTable(model);;
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
