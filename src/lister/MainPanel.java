package lister;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	private JPanel leftPanel;
	private JPanel rightPanel;
	private JList<ListEntry> list;
	
	public MainPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		leftPanel = new JPanel();
		rightPanel = new JPanel();
		list = new JList<ListEntry>();
		leftPanel.add(list);
		
		JScrollPane leftScrollPane = new JScrollPane(leftPanel);
		
		leftPanel.setVisible(true);
		rightPanel.setVisible(true);
		this.add(leftScrollPane);
		this.add(rightPanel);
	}
}
