package Frames;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Functions.pizzeria;
import Functions.pizza;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import Functions.pizzeria.*;
import Functions.*;
import javax.swing.JList;

public class showOrdersFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static showOrdersFrame frame = new showOrdersFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public showOrdersFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ORDERS = new JLabel("ORDERS:");
		ORDERS.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ORDERS.setBounds(123, 11, 173, 61);
		contentPane.add(ORDERS);
		
		JButton backButton = new JButton("BACK");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				startingFrame.frame.setVisible(true);
			}
		});
		backButton.setBounds(10, 11, 89, 23);
		contentPane.add(backButton);
		
		JList list = new JList();
		list.setBounds(29, 83, 323, 209);
		contentPane.add(list);
		
		pizza test = new pizza(30, "top1", "top2", "top3", "ketch", 10,"da");
		pizza test2 = new pizza(30, "top1", "top2", "top3", "ketch", 10,"net");
		
		ArrayList<Object> checkouts = Functions.pizzeria.getArray();
		checkouts.add(test);
		checkouts.add(test2);
		
		DefaultListModel listModel = new DefaultListModel();
		String names = "";
		for(int i = 1; i < checkouts.size()+1;i++) {
			listModel.addElement(i+". "+checkouts.get(i-1));
		}
		list.setModel(listModel);
		
		
	}
}
