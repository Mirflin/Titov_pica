package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Functions.pizzeria;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class newOrderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static List<Boolean> params = pizzeria.getList();
	public static Boolean[] testing = pizzeria.testing;
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
		setBounds(100, 100, 772, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel topping1 = new JLabel("New label");
		topping1.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/p.png")));
		
		topping1.setBounds(10, 112, 100, 100);
		contentPane.add(topping1);
		
		JLabel topping3 = new JLabel("New label");
		topping3.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/moza.png")));
		
		topping3.setBounds(266, 112, 100, 100);
		contentPane.add(topping3);
		
		JLabel topping2 = new JLabel("New label");
		topping2.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/pin.png")));
		
		topping2.setBounds(130, 112, 100, 100);
		contentPane.add(topping2);
		
		JLabel topping4 = new JLabel("New label");
		topping4.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/sausa.png")));
		
		topping4.setBounds(393, 112, 68, 100);
		contentPane.add(topping4);
		
		JLabel topping5 = new JLabel("New label");
		topping5.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/peper.png")));
		
		topping5.setBounds(494, 129, 100, 67);
		contentPane.add(topping5);
		
		JLabel topping6 = new JLabel("New label");
		topping6.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/peperr.png")));
		
		topping6.setBounds(630, 112, 100, 100);
		contentPane.add(topping6);
		
		JLabel lblNewLabel_4 = new JLabel("Choose toppings");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(284, 11, 193, 66);
		contentPane.add(lblNewLabel_4);
		
		JButton toppingsNext = new JButton("NEXT");
		toppingsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i <= 6;i++) {
					if(testing[i] == true) {
						params.add(true);
					}
					else {
						params.add(false);
					}
				}
				pizzeria.setList(params);
				
				frame.setVisible(false);
				frame.dispose();
				newOrderFrame2.frame.setVisible(true);
			}
		});
		toppingsNext.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		toppingsNext.setBounds(315, 303, 111, 40);
		contentPane.add(toppingsNext);
		
		JCheckBox salami = new JCheckBox("salami +0,5");
		salami.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(salami.isSelected()) {
					testing[0] = true;
				}else {
					testing[0] = false;
				}
			}
		});
		salami.setBounds(20, 219, 97, 23);
		contentPane.add(salami);
		
		JCheckBox pineaple = new JCheckBox("pineapples +0,4");
		pineaple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pineaple.isSelected()) {
					testing[1] = true;
				}else {
					testing[1] = false;
				}
			}
		});
		pineaple.setBounds(130, 219, 111, 23);
		contentPane.add(pineaple);
		
		JCheckBox mozzarella = new JCheckBox("extra mozzarella +0,5");
		mozzarella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mozzarella.isSelected()) {
					testing[2] = true;
				}else {
					testing[2] = false;
				}
			}
		});
		mozzarella.setBounds(248, 219, 131, 23);
		contentPane.add(mozzarella);
		
		JCheckBox sausages = new JCheckBox("sausages +0,5");
		sausages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sausages.isSelected()) {
					testing[3] = true;
				}else {
					testing[3] = false;
				}
			}
		});
		sausages.setBounds(380, 219, 97, 23);
		contentPane.add(sausages);
		
		JCheckBox greenpeper = new JCheckBox("green peper +0,4");
		greenpeper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(greenpeper.isSelected()) {
					testing[4] = true;
				}else {
					testing[4] = false;
				}
			}
		});
		greenpeper.setBounds(494, 219, 117, 23);
		contentPane.add(greenpeper);
		
		JCheckBox redpeper = new JCheckBox("red peper + 0,5");
		redpeper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(redpeper.isSelected()) {
					testing[5] = true;
				}else {
					testing[5] = false;
				}
			}
		});
		redpeper.setBounds(630, 219, 111, 23);
		contentPane.add(redpeper);
	}
}
