package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Functions.pizza;
import Functions.pizzeria;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class checkoutFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static checkoutFrame frame = new checkoutFrame();
	

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
	public checkoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BACKbutton = new JButton("BACK\r\n");
		BACKbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				startingFrame.frame.setVisible(true);
			}
		});
		BACKbutton.setBounds(10, 11, 89, 23);
		contentPane.add(BACKbutton);
		
		JTextPane textPaneCheckout = new JTextPane();
		textPaneCheckout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPaneCheckout.setBounds(20, 45, 380, 338);
		textPaneCheckout.setText(((pizza) pizzeria.getArray().get(showOrdersFrame.value)).checkout());
		contentPane.add(textPaneCheckout);
	}
}
