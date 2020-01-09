package br.com.main;

import br.com.model.*;

public class Main{
	
	public static void main(String[] args) {
		
		Aviao aviao; 
		aviao = new Aviao();
		
		aviao.setModelo("ABC");
		aviao.setTipo("Comercial");
		aviao.setCor("ROSA");
		aviao.Acelerar();
		aviao.Abastecer(2);
		
		Carro carro; 
		carro= new Carro();
		
		carro.setModelo("ABC");
		carro.setMarca("Fiat");
		carro.setCor("Azul");
		carro.Abastecer(100);
		carro.Abastecer(10);
		
		Caminhao caminhao; 
		caminhao = new Caminhao();
		
		caminhao.setModelo("ABC");
		carro.setPassageiros(2);
		carro.setCor("Preto");
		carro.Abastecer(100);
		carro.Abastecer(10);
		
		carro.imprime();
		caminhao.imprime();
		aviao.imprime();

	}

}
