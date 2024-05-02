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

public class newOrderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static List<Boolean> params = pizzeria.getList();
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
		setBounds(100, 100, 425, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel topping1 = new JLabel("New label");
		topping1.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/p.png")));
		topping1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				params.set(2,true);
			}
		});
		topping1.setBounds(10, 112, 100, 100);
		contentPane.add(topping1);
		
		JLabel topping3 = new JLabel("New label");
		topping3.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/moza.png")));
		topping3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				params.set(4,true);
			}
		});
		topping3.setBounds(266, 112, 100, 100);
		contentPane.add(topping3);
		
		JLabel topping2 = new JLabel("New label");
		topping2.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/pin.png")));
		topping2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				params.set(3,true);
			}
		});
		topping2.setBounds(130, 112, 100, 100);
		contentPane.add(topping2);
		
		JLabel topping4 = new JLabel("New label");
		topping4.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/sausa.png")));
		topping4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				params.set(5,true);
			}
		});
		topping4.setBounds(29, 251, 68, 100);
		contentPane.add(topping4);
		
		JLabel topping5 = new JLabel("New label");
		topping5.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/peper.png")));
		topping5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				params.set(6,true);
			}
		});
		topping5.setBounds(130, 260, 100, 67);
		contentPane.add(topping5);
		
		JLabel topping6 = new JLabel("New label");
		topping6.setIcon(new ImageIcon(newOrderFrame.class.getResource("/Frames/images/peperr.png")));
		topping6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				params.set(7,true);
			}
		});
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
		
		JLabel lblNewLabel = new JLabel("salami +0,5");
		lblNewLabel.setBounds(30, 223, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPineaple = new JLabel("pineaples +0,4");
		lblPineaple.setBounds(140, 223, 80, 14);
		contentPane.add(lblPineaple);
		
		JLabel lblMo = new JLabel("extra mozzarella +0,5");
		lblMo.setBounds(272, 223, 127, 14);
		contentPane.add(lblMo);
		
		JLabel lblSausages = new JLabel("sausages +0,5");
		lblSausages.setBounds(29, 362, 80, 14);
		contentPane.add(lblSausages);
		
		JLabel lblGreenPeper = new JLabel("green peper +0,4");
		lblGreenPeper.setBounds(130, 338, 100, 14);
		contentPane.add(lblGreenPeper);
		
		JLabel lblRedPeper = new JLabel("red peper +0,7");
		lblRedPeper.setBounds(276, 362, 80, 14);
		contentPane.add(lblRedPeper);
	}
}
