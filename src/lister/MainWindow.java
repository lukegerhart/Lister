package lister;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPanel;

import listeners.*;

public class MainWindow {

	private JFrame frame;
	private JMenuBar menuBar;
	private JPanel panel;
	
	private final int width = 600;
	private final int height = 800;

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenu menu;
		JMenuItem menuItem;
		
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		
		menuItem = makeMenuItem("Open");
		menuItem.addActionListener(new OpenListener());
		menu.add(menuItem);
		
		menuItem = makeMenuItem("Save");
		menuItem.addActionListener(new SaveListener());
		menu.add(menuItem);
		
		menuBar.add(menu);
		
		menu = new JMenu("New List");
		menu.addActionListener(new NewListListener());
		
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		
		panel = new MainPanel();
		frame.add(panel);
		frame.setTitle("Lister");
		frame.setVisible(true);
	}
	
	private JMenuItem makeMenuItem(String text) {
		return new JMenuItem(text);
	}

}
