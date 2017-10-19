package lister;

import listeners.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{

	//private JFrame frame;
	
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
		
		this.setBounds(100, 100, width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*-----Menu----*/
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;
		
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		
		menuItem = new JMenuItem("Open");
		menuItem.addActionListener(new OpenListener());
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save");
		menuItem.addActionListener(new SaveListener());
		menu.add(menuItem);
		
		menuBar.add(menu);
		
		menu = new JMenu("New List");
		menu.addActionListener(new NewListListener());
		
		menuBar.add(menu);
		/*---End Menu----*/
		
		this.setJMenuBar(menuBar);
		this.setTitle("Lister");
		MainPanel mainPanel = new MainPanel();
		
		this.add(mainPanel);
		
		this.setVisible(true);
	}

}
