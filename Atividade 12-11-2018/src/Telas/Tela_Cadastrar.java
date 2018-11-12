package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Jogadores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Cadastrar extends JFrame  {

	private JPanel FODAC;
	private JTextField txtNome;
	private JTextField txtTime;
	private JTextField txtIdade;
	private JTextField txtPosicao;
	private JTextField txtNumero;
	Tela_Listar Tlistar = new Tela_Listar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastrar frame = new Tela_Cadastrar();
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
	public Tela_Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		FODAC = new JPanel();
		FODAC.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FODAC);
		FODAC.setLayout(null);
		
		Jogadores jogador = new Jogadores();
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 43, 55, 14);
		FODAC.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(10, 80, 46, 14);
		FODAC.add(lblIdade);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(10, 122, 46, 14);
		FODAC.add(lblTime);
		
		JLabel lblPosio = new JLabel("Posi\u00E7\u00E3o:");
		lblPosio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPosio.setBounds(10, 160, 55, 14);
		FODAC.add(lblPosio);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero.setBounds(10, 201, 69, 14);
		FODAC.add(lblNumero);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNome.setBounds(75, 42, 230, 20);
		FODAC.add(txtNome);
		txtNome.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTime.setBounds(75, 121, 230, 20);
		FODAC.add(txtTime);
		txtTime.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtIdade.setBounds(75, 79, 46, 20);
		FODAC.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtPosicao = new JTextField();
		txtPosicao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPosicao.setBounds(75, 159, 86, 20);
		FODAC.add(txtPosicao);
		txtPosicao.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNumero.setBounds(75, 198, 46, 20);
		FODAC.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Tlistar.jogador.setNome(txtNome.getText());
				Tlistar.jogador.setIdade(Integer.parseInt(txtIdade.getText()));
				Tlistar.jogador.setTime(txtTime.getText());
				Tlistar.jogador.setPosicao(txtPosicao.getText());
				Tlistar.jogador.setNumero(Integer.parseInt(txtNumero.getText()));
				
				Tlistar.lista_jogadores.add(jogador);
				Tlistar.adiciona();
				dispose();
				Tlistar.setVisible(true);
			}
		});
		btnSalvar.setForeground(new Color(0, 128, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(435, 222, 89, 23);
		FODAC.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Tlistar.setVisible(true);
				
			}
		});
		btnCancelar.setForeground(new Color(128, 0, 0));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBounds(435, 266, 89, 23);
		FODAC.add(btnCancelar);
	}
}
