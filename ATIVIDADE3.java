package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class ATIVIDADE3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATIVIDADE3 frame = new ATIVIDADE3();
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
	public ATIVIDADE3() {
		setTitle("Cadastro de Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(28, 36, 57, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(85, 35, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Data de Nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(286, 38, 133, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(429, 35, 98, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSexo.setBounds(552, 38, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFeminino.setBounds(604, 36, 109, 23);
		contentPane.add(rdbtnFeminino);
	}
}
