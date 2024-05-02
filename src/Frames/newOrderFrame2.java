package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class newOrderFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static newOrderFrame2 frame = new newOrderFrame2();

	/**
	 * Launch the application.
	 */
	public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
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
		
		JRadioButton cmChoose1 = new JRadioButton("20");
		cmChoose1.setBounds(28, 51, 72, 23);
		contentPane.add(cmChoose1);
		
		JRadioButton cmChoose2 = new JRadioButton("30");
		cmChoose2.setBounds(28, 89, 72, 23);
		contentPane.add(cmChoose2);
		
		JRadioButton cmChoose3 = new JRadioButton("40");
		cmChoose3.setBounds(28, 128, 72, 23);
		contentPane.add(cmChoose3);
		
		JRadioButton cmChoose4 = new JRadioButton("50");
		cmChoose4.setBounds(28, 169, 72, 23);
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
				System.out.print(getSelectedButtonText(cmGroup));
				startingFrame.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(255, 188, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel sauce1 = new JLabel("New label");
		sauce1.setIcon(new ImageIcon(newOrderFrame2.class.getResource("/Frames/images/ketchup.png")));
		sauce1.setBounds(121, 28, 89, 85);
		contentPane.add(sauce1);
		
		JLabel sauce2 = new JLabel("New label");
		sauce2.setIcon(new ImageIcon(newOrderFrame2.class.getResource("/Frames/images/mayo.png")));
		sauce2.setBounds(240, 28, 89, 85);
		contentPane.add(sauce2);
		
		JCheckBox ketchup = new JCheckBox("extra ketchup");
		ketchup.setBounds(103, 125, 118, 23);
		contentPane.add(ketchup);
		
		JCheckBox mayonaze = new JCheckBox("extra mayonaze");
		mayonaze.setBounds(223, 125, 121, 23);
		contentPane.add(mayonaze);
		
		JLabel lblNewLabel = new JLabel("Choose pizza cm:");
		lblNewLabel.setBounds(10, 11, 89, 14);
		contentPane.add(lblNewLabel);
	}
}
