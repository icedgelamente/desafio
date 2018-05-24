package controladores;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;



public class Acao {
	
	
	public static void cadastrar(String produto, double Valor, int quantidade){
		
	
		Produto p = new Produto();
		p.produto = produto;
		p.valor = Valor;
		p.quantidade = quantidade;
		
		Produto.dados.add(p);
		}
		
	public DefaultTableModel listar(){
			
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("Produto");
			modelo.addColumn("Valor");
			modelo.addColumn("Quantidade");
			
			for(int i=0; i < Produto.dados.size(); i++){
				modelo.addRow(new Object[]{
				Produto.dados.get(i).getProduto(),
				Produto.dados.get(i).getValor(),
				Produto.dados.get(i).getQuantidade()
				
				
		
						
				});
			}	
			return modelo;
	}
				
			
			
			
		}
		
		
	

	


