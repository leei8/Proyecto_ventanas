import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userLabel = new JLabel("Usuario:");
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		userLabel.setForeground(new Color(205, 92, 92));
		userLabel.setBackground(Color.WHITE);
		userLabel.setBounds(69, 83, 57, 27);
		contentPane.add(userLabel);
		
		JLabel passLabel = new JLabel("Contrase\u00F1a:");
		passLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		passLabel.setForeground(new Color(205, 92, 92));
		passLabel.setBackground(Color.WHITE);
		passLabel.setBounds(69, 121, 74, 27);
		contentPane.add(passLabel);
		
		userField = new JTextField();
		userField.setBackground(new Color(255, 204, 204));
		userField.setBounds(164, 84, 142, 24);
		contentPane.add(userField);
		userField.setColumns(10);
		
		passField = new JPasswordField();
		passField.setFont(new Font("Tahoma", Font.BOLD, 12));
		passField.setBackground(new Color(255, 204, 204));
		passField.setBounds(164, 121, 142, 24);
		contentPane.add(passField);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String user = userField.getText();
				String pass = String.valueOf(passField.getPassword());
				if (user.equals("ikaslea") && pass.equals("1234")){
					botonAceptar.setBackground(Color.GREEN);
				} else
					botonAceptar.setBackground(Color.RED);
	
			}
		});
		botonAceptar.setBounds(224, 155, 82, 23);
		contentPane.add(botonAceptar);
		
		JCheckBox chckbxOlvidMiContrasea = new JCheckBox("Olvid\u00E9 mi contrase\u00F1a");
		chckbxOlvidMiContrasea.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxOlvidMiContrasea.setBounds(79, 155, 129, 23);
		contentPane.add(chckbxOlvidMiContrasea);
	}

}
