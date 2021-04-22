package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		lista.add(new Chefe(1001, "Alberto Setubal", 10000.00,15,1230.0));
		lista.add(new Comissionado(1002, "Paulo Pereira", 4872.35,22.7));
		lista.add(new Comissionado(1003, "Ana Fonseca", 5600.0, 17.35));
		lista.add(new Horista(1004, "Andre Salgado", 40, 56.75));
		lista.add(new Horista(1005, "Luciana Gomes", 35, 87.34));
		lista.add(new Empreiteiro(1006, "Jose de Almeida Pires", 3450.00));		
		
		// vamos "rodar a folha"
		
		for (Funcionario f: lista) {
			System.out.printf("%s R$ %.2f\n", f.getNome(), f.calcularSalario());
		}
	}

}
