package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class Lista_Participantes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Participantes frame = new Lista_Participantes();
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
	public Lista_Participantes() {
		setTitle("The Sage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDeGerenciamento = new JLabel("Menu de Gerenciamento");
		lblMenuDeGerenciamento.setForeground(Color.WHITE);
		lblMenuDeGerenciamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMenuDeGerenciamento.setBounds(274, 26, 217, 25);
		contentPane.add(lblMenuDeGerenciamento);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(733, 269, 17, 246);
		contentPane.add(scrollBar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(606, 124, 89, 35);
		contentPane.add(btnExcluir);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(33, 269, 717, 246);
		contentPane.add(textPane);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlterar.setBounds(340, 124, 89, 35);
		contentPane.add(btnAlterar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastrar.setBounds(70, 124, 103, 35);
		contentPane.add(btnCadastrar);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\Faculdade\\Segundo Semestre\\Projeto-Integrador-2\\WhatsApp Image 2018-10-28 at 17.21.27.jpeg"));
		label.setBounds(0, 0, 800, 561);
		contentPane.add(label);
	}
}
