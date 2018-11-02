package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.ClassePleb;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Plebiscito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plebiscito frame = new Plebiscito();
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
	public Plebiscito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Label Plebiscito
		JLabel lblPlebiscito = new JLabel("Plebiscito");
		lblPlebiscito.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPlebiscito.setBounds(310, 100, 163, 37);
		contentPane.add(lblPlebiscito);
		
		
		//RadioButton Sim
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSim.setBounds(242, 187, 109, 23);
		contentPane.add(rdbtnSim);
		
		
		//RadioButton Nao
		JRadioButton rdbtnNao = new JRadioButton("N\u00E3o");
		rdbtnNao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNao.setBounds(242, 237, 109, 23);
		contentPane.add(rdbtnNao);
		
		
		//RadioButton Nulo
		JRadioButton rdbtnNulo = new JRadioButton("Nulo");
		rdbtnNulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNulo.setBounds(242, 290, 109, 23);
		contentPane.add(rdbtnNulo);
		
		
		//Botão Votar
		JButton btnVotar = new JButton("Votar");
		btnVotar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVotar.setBounds(384, 237, 89, 23);
		contentPane.add(btnVotar);
		
		
		//Botão Finalizar
		JButton btnFinalizarVotao = new JButton("Finalizar Vota\u00E7\u00E3o");
		btnFinalizarVotao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFinalizarVotao.setBounds(310, 492, 163, 23);
		contentPane.add(btnFinalizarVotao);
		
		ButtonGroup Opcoes = new ButtonGroup();
		Opcoes.add(rdbtnSim);
		Opcoes.add(rdbtnNao);
		Opcoes.add(rdbtnNulo);
		
		ClassePleb vota = new ClassePleb();
		vota.setNao((float) 0);
		vota.setNulo((float) 0);
		vota.setSim((float) 0);
		vota.setTotal((float) 0);
		
		btnVotar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSim.isSelected()) {
					vota.setSim(vota.getSim() + 1);
					JOptionPane.showMessageDialog(null, "Você votou Sim");
				}
				
				else if(rdbtnNao.isSelected()) {
					vota.setNao(vota.getNao() + 1);
					JOptionPane.showMessageDialog(null, "Você votou Não");
				}
				
				else if(rdbtnNulo.isSelected()) {
					vota.setNulo(vota.getNulo() + 1);
					JOptionPane.showMessageDialog(null, "Você votou Nulo");
				}
				
			}
		});
		
		btnFinalizarVotao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				vota.setTotal(vota.getSim() + vota.getNao() + vota.getNulo());
				
				JOptionPane.showMessageDialog(null, "Sim: "+(vota.getSim()/(vota.getTotal()/100)+"%\nNão: "+(vota.getNao()/(vota.getTotal()/100)+"%\nNulo: "+(vota.getNulo()/(vota.getTotal()/100)+"%"))));
				
			}
		});
		
	}
}
