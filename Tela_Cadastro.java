package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Tela_Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro frame = new Tela_Cadastro();
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
	public Tela_Cadastro() {
		setTitle("The Sage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ButtonGroup Cor_Pele = new ButtonGroup();
		ButtonGroup Ocupacao = new ButtonGroup();
		ButtonGroup Curso = new ButtonGroup();
		ButtonGroup Periodo = new ButtonGroup();
		ButtonGroup Tipo_Cabelo = new ButtonGroup();
		ButtonGroup Cor_Cabelo = new ButtonGroup();
		ButtonGroup Cor_Olhos = new ButtonGroup();
		
		
		
		
		//Label Nome
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(24, 81, 72, 15);
		contentPane.add(lblNome);

				
		
		//Label Cor da Pele
		
		JLabel lblCorDePele = new JLabel("Cor de Pele :");
		lblCorDePele.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCorDePele.setForeground(Color.WHITE);
		lblCorDePele.setBounds(24, 128, 99, 15);
		contentPane.add(lblCorDePele);
		
		
						
		//Label Ocupacao
		
		JLabel lblOcupacao = new JLabel("Ocupa\u00E7\u00E3o na Faculdade :");
		lblOcupacao.setForeground(Color.WHITE);
		lblOcupacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOcupacao.setBounds(24, 170, 180, 15);
		contentPane.add(lblOcupacao);
						
		
		
		//Label Curso
		
		JLabel lblCurso = new JLabel("Curso :");
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCurso.setBounds(24, 211, 72, 15);
		contentPane.add(lblCurso);
		
						
		
		//Label Periodo
		
		JLabel lblPeriodo = new JLabel("Periodo :");
		lblPeriodo.setForeground(Color.WHITE);
		lblPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPeriodo.setBounds(24, 251, 72, 15);
		contentPane.add(lblPeriodo);
		
				
		
		//Label Tipo Cabelo
		
		JLabel lblTipoDeCabelo = new JLabel("Tipo de Cabelo");
		lblTipoDeCabelo.setForeground(Color.WHITE);
		lblTipoDeCabelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeCabelo.setBounds(24, 333, 110, 15);
		contentPane.add(lblTipoDeCabelo);
		
						
		
		//Label Cor Cabelo
		
		JLabel lblCorDoCabelo = new JLabel("Cor do Cabelo");
		lblCorDoCabelo.setForeground(Color.WHITE);
		lblCorDoCabelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCorDoCabelo.setBounds(206, 333, 110, 15);
		contentPane.add(lblCorDoCabelo);
		
						
		
		//Cor Olhos
		
		JLabel lblCorDosOlhos = new JLabel("Cor dos Olhos");
		lblCorDosOlhos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorDosOlhos.setForeground(Color.WHITE);
		lblCorDosOlhos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCorDosOlhos.setBounds(398, 333, 110, 15);
		contentPane.add(lblCorDosOlhos);
		
		
				
		//Panel Foto
		
		JPanel pnlFoto = new JPanel();
		pnlFoto.setBounds(596, 26, 150, 200);
		contentPane.add(pnlFoto);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNome.setBounds(90, 80, 280, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		
						
		//RadioButton Branco
		
		JRadioButton rdbtnBranco = new JRadioButton("Branco");
		rdbtnBranco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnBranco.setBounds(129, 126, 109, 23);
		contentPane.add(rdbtnBranco);
		
		Cor_Pele.add(rdbtnBranco);
		
				
		
		//RadioButton Negro
		
		JRadioButton rdbtnNegro = new JRadioButton("Negro");
		rdbtnNegro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNegro.setBounds(261, 126, 109, 23);
		contentPane.add(rdbtnNegro);
		
		Cor_Pele.add(rdbtnNegro);
						
		//RadioButton Pardo
		
		JRadioButton rdbtnPardo = new JRadioButton("Pardo");
		rdbtnPardo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPardo.setBounds(399, 126, 109, 23);
		contentPane.add(rdbtnPardo);
		
		Cor_Pele.add(rdbtnPardo);
		
						
		//Botao Adicionar Imagem
		
		JButton btnAdicionarImagem = new JButton("Adicionar Imagem");
		btnAdicionarImagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdicionarImagem.setBounds(596, 237, 150, 23);
		contentPane.add(btnAdicionarImagem);
		
						
		
		//RadioButton Sistemas
		
		JRadioButton rdbtnSistemas = new JRadioButton("Sistemas");
		rdbtnSistemas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSistemas.setBounds(90, 207, 109, 23);
		contentPane.add(rdbtnSistemas);
		
		Curso.add(rdbtnSistemas);
		
		
						
		//RadioButton Analise
		
		JRadioButton rdbtnAnalise = new JRadioButton("Analise");
		rdbtnAnalise.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAnalise.setBounds(227, 207, 109, 23);
		contentPane.add(rdbtnAnalise);
		
		Curso.add(rdbtnAnalise);
		
						
		
		//RadioButton Aluno
		
		JRadioButton rdbtnAluno = new JRadioButton("Aluno");
		rdbtnAluno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAluno.setBounds(210, 166, 109, 23);
		contentPane.add(rdbtnAluno);
		
		Ocupacao.add(rdbtnAluno);
		
						
		
		//RadioButton Funcionario
		
		JRadioButton rdbtnFuncionario = new JRadioButton("Funcionario");
		rdbtnFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFuncionario.setBounds(341, 166, 109, 23);
		contentPane.add(rdbtnFuncionario);
		
		Ocupacao.add(rdbtnFuncionario);
				
		
		//RadioButton Primeiro
		
		JRadioButton rdbtnPrimeiro = new JRadioButton("Primeiro");
		rdbtnPrimeiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPrimeiro.setBounds(95, 249, 109, 23);
		contentPane.add(rdbtnPrimeiro);
		
		Periodo.add(rdbtnPrimeiro);
		
						
		
		//RadioButton Segundo
		JRadioButton rdbtnSegundo = new JRadioButton("Segundo");
		rdbtnSegundo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSegundo.setBounds(227, 249, 109, 23);
		contentPane.add(rdbtnSegundo);
		
		Periodo.add(rdbtnSegundo);
		
		
		
		//RaioButton Terceiro
		
		JRadioButton rdbtnTerceiro = new JRadioButton("Terceiro");
		rdbtnTerceiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnTerceiro.setBounds(358, 249, 109, 23);
		contentPane.add(rdbtnTerceiro);
		
		Periodo.add(rdbtnTerceiro);
		
		
		
		//RadioButton Liso
		
		JRadioButton rdbtnLiso = new JRadioButton("Liso");
		rdbtnLiso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnLiso.setBounds(24, 373, 109, 23);
		contentPane.add(rdbtnLiso);
		
		Tipo_Cabelo.add(rdbtnLiso);
		
		
		
		//RadioButton Cacheado
		
		JRadioButton rdbtnCacheado = new JRadioButton("Cacheado");
		rdbtnCacheado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCacheado.setBounds(24, 420, 109, 23);
		contentPane.add(rdbtnCacheado);
		
		Tipo_Cabelo.add(rdbtnCacheado);
		
		
		
		//RadioButton Ondulado
		
		JRadioButton rdbtnOndulado = new JRadioButton("Ondulado");
		rdbtnOndulado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOndulado.setBounds(24, 467, 109, 23);
		contentPane.add(rdbtnOndulado);
		
		Tipo_Cabelo.add(rdbtnOndulado);
		
		
		
		//RadioButton  Cabelo Castanho
		
		JRadioButton rdbtnCastanho = new JRadioButton("Castanho");
		rdbtnCastanho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCastanho.setBounds(206, 373, 109, 23);
		contentPane.add(rdbtnCastanho);
		
		Cor_Cabelo.add(rdbtnCastanho);
		
		
		
		//RadioButton Loiro
		
		JRadioButton rdbtnLoiro = new JRadioButton("Loiro");
		rdbtnLoiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnLoiro.setBounds(206, 420, 109, 23);
		contentPane.add(rdbtnLoiro);
		
		Cor_Cabelo.add(rdbtnLoiro);
		
		
		
		
		
		//RadioButton Verde
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnVerde.setBounds(398, 373, 109, 23);
		contentPane.add(rdbtnVerde);
		
		Cor_Olhos.add(rdbtnVerde);
		
		
		//RadioButton  Olho Castanho
		JRadioButton rdbtnOlhoCastanho = new JRadioButton("Castanho");
		rdbtnOlhoCastanho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOlhoCastanho.setBounds(398, 420, 109, 23);
		contentPane.add(rdbtnOlhoCastanho);
		
		Cor_Olhos.add(rdbtnOlhoCastanho);
		
		
		
		//RadioButton Careca
		
		JRadioButton rdbtnCareca = new JRadioButton("Careca");
		rdbtnCareca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCareca.setBounds(24, 511, 109, 23);
		contentPane.add(rdbtnCareca);
		
		Tipo_Cabelo.add(rdbtnCareca);
		
		
		
		//RadioButton Azul
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		rdbtnAzul.setBackground(new Color(240, 240, 240));
		rdbtnAzul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAzul.setBounds(398, 467, 109, 23);
		contentPane.add(rdbtnAzul);
		
		Cor_Olhos.add(rdbtnAzul);
		
		
		
		//RadioButton Castanho Claro
		
		JRadioButton rdbtnCastanhoClaro = new JRadioButton("Castanho Claro");
		rdbtnCastanhoClaro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnCastanhoClaro.setBounds(206, 469, 109, 23);
		contentPane.add(rdbtnCastanhoClaro);
		
		Cor_Cabelo.add(rdbtnCastanhoClaro);
		
		
		
		//Botao Salvar
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(627, 420, 100, 23);
		contentPane.add(btnSalvar);
		
		
		
		//Botao Cancelar
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBounds(627, 467, 100, 23);
		contentPane.add(btnCancelar);
		
		
		
		//Background
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\Faculdade\\Segundo Semestre\\Projeto-Integrador-2\\WhatsApp Image 2018-10-28 at 17.21.27.jpeg"));
		label.setBounds(0, 0, 800, 561);
		contentPane.add(label);
	}
}
