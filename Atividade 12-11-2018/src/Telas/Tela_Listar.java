package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Classes.Jogadores;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Listar extends JFrame {

	private JPanel contentPane;
	private JTable TblJogadores;
	public ArrayList<Jogadores> lista_jogadores = new ArrayList<Jogadores>();
	public Jogadores jogador = new Jogadores();
	
	DefaultTableModel modelo = new DefaultTableModel();
	
	public void adiciona () {
		for (Jogadores j  : lista_jogadores ) {
		
			modelo.addRow(new Object [] {j.getNome(), j.getIdade(), j.getTime(), j.getPosicao(), j.getNumero()});
		
		
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Listar frame = new Tela_Listar();
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
	public Tela_Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JPanel panel = new JPanel();
		panel.setBounds(10, 226, 664, 225);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		

		jogador.setNome("Aloisio Chulapa");
		jogador.setIdade(56);
		jogador.setTime("Remo");
		jogador.setPosicao("Atacante");
		jogador.setNumero(10);
		
		lista_jogadores.add(jogador);
		
		TblJogadores = new JTable(modelo);
		scrollPane.setViewportView(TblJogadores);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			dispose();
			new Tela_Cadastrar().setVisible(true);
				
			}
		});
		btnCadastrar.setBounds(154, 137, 93, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(440, 137, 89, 23);
		contentPane.add(btnExcluir);
		
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Time");
		modelo.addColumn("Posição");
		modelo.addColumn("Numero");
		
		adiciona();
		
		
		
	}
}
