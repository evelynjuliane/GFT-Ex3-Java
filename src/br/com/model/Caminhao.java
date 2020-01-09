package br.com.model;


public class Caminhao extends Veiculo {

	public Caminhao() {
		super();
	}

	public Caminhao(String modelo, int passageiros, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super(modelo, passageiros, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
	}
	
	public void Abastecer(float litrosACombustivel){
		if(this.litrosCombustivel < 100) {
			this.litrosCombustivel = (int)litrosACombustivel;
		}else {
		System.out.println("O Veiculo está com o tanque cheio!");
		}
	
	}
	
	public void imprime() {
		System.out.println(getModelo() +"\n"+ getPassageiros() +  "\n" + getCor());
	}
}