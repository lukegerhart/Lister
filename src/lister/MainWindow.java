package lister;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenu;

public class MainWindow {

	private JFrame frame;
	
	private int size_x;
	private int size_y;

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
		size_x = 500;
		size_y = 500;
		frame = new JFrame();
		frame.setBounds(100, 100, size_x, size_y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
