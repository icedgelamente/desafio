package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controladores.Acao;

public class FormularioPrincipal {

	public FormularioPrincipal() {
	
		//Instanciar JFrame
		JFrame formulario = new JFrame("Cadastro");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);	

		//JLabel
		JLabel nome = new JLabel();
		nome.setText("Produto:");
		nome.setBounds(10, 30, 120, 20);

		JLabel valor = new JLabel();
		valor.setText("Valor:");
		valor.setBounds(10, 60, 120, 20);
		
		JLabel quantidade = new JLabel();
		quantidade.setText("Quantidade:");
		quantidade.setBounds(10, 90, 120, 20);
		
		
		//JTextField
		JTextField campon = new JTextField();
		   campon.setBounds(90, 30, 100, 20);
		   
		   JTextField campov = new JTextField();
		   campov.setBounds(90, 60, 100, 20);
		   
		   JTextField campoq = new JTextField();
		   campoq.setBounds(90, 90, 100, 20);
		   	
		   Acao a = new Acao();
		   
		   	JTable tabela = new JTable(a.listar());
		   	
		   	JScrollPane barraRolagem = new JScrollPane(tabela);
		   	barraRolagem.setBounds(20, 150, 250, 110);
		   	
		   	
		   	
		   	
		   //JButton
		   JButton botao = new JButton();
		   botao.setText("Cadastrar");
		botao.setBounds(90, 115, 100, 25);	
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String Produto = campon.getText();
				double Valor = Double.parseDouble(campov.getText()); 
				int Quantidade = Integer.parseInt(campoq.getText());
				
			
				a.cadastrar(Produto, Valor, Quantidade);
				tabela.setModel(a.listar());
				
				campon.setText("");
				campov.setText("");
				campoq.setText("");
				campon.requestFocus();

			
			}
		});
		
		
				
		
		
		//Adicionar elementos ao JFrame
		formulario.add(campon);
		formulario.add(campov);
		formulario.add(campoq);
		formulario.add(botao);
		formulario.add(nome);
		formulario.add(valor);
		formulario.add(quantidade);
		formulario.add(barraRolagem);
	
		
		//Exibir o formulario
		formulario.setVisible(true);
		
		
		
		}

		}
