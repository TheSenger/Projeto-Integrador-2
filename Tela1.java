package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Tela1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = 	new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int index;
		
		
		//Label Estado
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstado.setBounds(75, 106, 57, 20);
		contentPane.add(lblEstado);
		
		
		//Label Cidade
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCidade.setBounds(75, 230, 57, 14);
		contentPane.add(lblCidade);
		
		
		//ComboBox Estado
		JComboBox CboxEstado = new JComboBox();
		CboxEstado.setModel(new DefaultComboBoxModel(new String[] {"Paran\u00E1", "S\u00E3o Paulo", "Santa Catarina"}));
		CboxEstado.setSelectedIndex(-1);
		CboxEstado.setBounds(128, 108, 188, 20);
		contentPane.add(CboxEstado);
		
		
		//ComboBox Cidade
		JComboBox CboxCidade = new JComboBox();
		CboxCidade.setSelectedIndex(-1);
		CboxCidade.setBounds(128, 229, 188, 20);
		contentPane.add(CboxCidade);
		
		
		CboxEstado.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(CboxEstado.getSelectedItem() == "Paraná") { 
					CboxCidade.removeAllItems();
					CboxCidade.setSelectedItem("Curitiba");
					CboxCidade.addItem("Curitiba");
					CboxCidade.addItem("Araucária");
					CboxCidade.addItem("São José dos Pinhais");
				}
				if(CboxEstado.getSelectedItem() == "São Paulo") { 
					CboxCidade.removeAllItems();
					CboxCidade.setSelectedItem("São Paulo");
					CboxCidade.addItem("São Paulo");
					CboxCidade.addItem("Santos");
					CboxCidade.addItem("Aparecida do Norte");
				}
				if(CboxEstado.getSelectedItem() == "Santa Catarina") { 
					CboxCidade.removeAllItems();
					CboxCidade.setSelectedItem("Florianopolis");
					CboxCidade.addItem("Florianopolis");
					CboxCidade.addItem("Chapecó");
					CboxCidade.addItem("Curitibanos");
				}
				
			}
		});


		
		
		
		
		
	}
}
