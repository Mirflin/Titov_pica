package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Functions.pizzeria;
import Functions.pizza;
import Frames.newOrderFrame;
public class startingFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static startingFrame frame = new startingFrame();
	
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
	public startingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameOfpizzeria = new JLabel("Nameless pizzeria");
		nameOfpizzeria.setFont(new Font("Tahoma", Font.PLAIN, 24));
		nameOfpizzeria.setBounds(97, 11, 190, 48);
		contentPane.add(nameOfpizzeria);
		
		JButton orderButton = new JButton("NEW order");
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i <= 6;i++) {
					pizzeria.testing[i] = false;
				}
				System.out.print("testing filled");
				frame.setVisible(false);
				frame.dispose();
				newOrderFrame.frame.setVisible(true);
			}
		});
		orderButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		orderButton.setBounds(125, 116, 122, 36);
		contentPane.add(orderButton);
		
		JButton showOrderButton = new JButton("SHOW orders\r\n");
		showOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				showOrdersFrame.frame.setVisible(true);
			}
		});
		showOrderButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		showOrderButton.setBounds(125, 174, 122, 36);
		contentPane.add(showOrderButton);
	}
}
