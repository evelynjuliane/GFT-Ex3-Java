package br.com.main;

import br.com.model.*;

public class Main{
	
	public static void main(String[] args) {
		
		Aviao aviao; 
		aviao = new Aviao("ABC", 2, "aaa222", "BRANCO", 0, false, 100, 0, 1000.0, "Comercial", "França");
		
		aviao.Acelerar();
		aviao.Abastecer(100);
	
		Carro carro; 
		carro= new Carro("Uno", 4, "FBC-2313", "PRETO", 50, true, 120, 0, 200.0, "Fiat", 5, "2019");
		
		carro.Acelerar();
		carro.Abastecer(100);
		carro.Abastecer(10);
		
		Caminhao caminhao; 
		caminhao = new Caminhao("VOLVO", 4, "AAA-222", "AZUL", 10, true, 200, 0, 100.00);
		
		caminhao.Acelerar();
		caminhao.Abastecer(100);
		caminhao.Abastecer(10);
		
		carro.imprime();
		caminhao.imprime();
		aviao.imprime();

	}

}
