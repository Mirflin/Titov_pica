package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class newOrderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static newOrderFrame frame = new newOrderFrame();

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
	public newOrderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel topping1 = new JLabel("New label");
		topping1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		topping1.setBounds(10, 112, 100, 100);
		contentPane.add(topping1);
		
		JLabel topping3 = new JLabel("New label");
		topping3.setBounds(266, 112, 100, 100);
		contentPane.add(topping3);
		
		JLabel topping2 = new JLabel("New label");
		topping2.setBounds(142, 112, 100, 100);
		contentPane.add(topping2);
		
		JLabel topping4 = new JLabel("New label");
		topping4.setBounds(10, 251, 100, 100);
		contentPane.add(topping4);
		
		JLabel topping5 = new JLabel("New label");
		topping5.setBounds(142, 251, 100, 100);
		contentPane.add(topping5);
		
		JLabel topping6 = new JLabel("New label");
		topping6.setBounds(266, 251, 100, 100);
		contentPane.add(topping6);
		
		JLabel lblNewLabel_4 = new JLabel("Choose toppings");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(90, 11, 193, 66);
		contentPane.add(lblNewLabel_4);
		
		JButton toppingsNext = new JButton("NEXT");
		toppingsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newOrderFrame2.frame.setVisible(true);
			}
		});
		toppingsNext.setBounds(130, 367, 89, 23);
		contentPane.add(toppingsNext);
	}
}
