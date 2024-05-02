package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JTextArea orderTextArea = new JTextArea();
		orderTextArea.setBounds(40, 80, 298, 201);
		contentPane.add(orderTextArea);
		
		JButton backButton = new JButton("BACK");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				startingFrame frame2 = new startingFrame();
				frame2.setVisible(true);
			}
		});
		backButton.setBounds(10, 11, 89, 23);
		contentPane.add(backButton);
	}
}
