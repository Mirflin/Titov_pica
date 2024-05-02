package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class newOrderFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static newOrderFrame2 frame = new newOrderFrame2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newOrderFrame2 frame = new newOrderFrame2();
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
	public newOrderFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton cmChoose1 = new JRadioButton("20 cm");
		cmChoose1.setBounds(6, 48, 109, 23);
		contentPane.add(cmChoose1);
		
		JRadioButton cmChoose2 = new JRadioButton("30 cm");
		cmChoose2.setBounds(6, 86, 109, 23);
		contentPane.add(cmChoose2);
		
		JRadioButton cmChoose3 = new JRadioButton("40 cm");
		cmChoose3.setBounds(6, 125, 109, 23);
		contentPane.add(cmChoose3);
		
		JRadioButton cmChoose4 = new JRadioButton("50 cm");
		cmChoose4.setBounds(6, 166, 109, 23);
		contentPane.add(cmChoose4);
		
		ButtonGroup cmGroup = new ButtonGroup();
		cmGroup.add(cmChoose1);
		cmGroup.add(cmChoose2);
		cmGroup.add(cmChoose3);
		cmGroup.add(cmChoose4);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newOrderFrame.frame.dispose();
				frame.dispose();
				startingFrame.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(255, 188, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel sauce1 = new JLabel("New label");
		sauce1.setBounds(121, 28, 89, 85);
		contentPane.add(sauce1);
		
		JLabel sauce2 = new JLabel("New label");
		sauce2.setBounds(240, 28, 89, 85);
		contentPane.add(sauce2);
		
		JLabel sauce3 = new JLabel("New label");
		sauce3.setBounds(171, 126, 89, 85);
		contentPane.add(sauce3);
	}
}
