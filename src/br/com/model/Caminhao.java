package br.com.model;


public class Caminhao extends Veiculo {

	public Caminhao() {
	}

	public Caminhao(String modelo, int passageiros, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super(modelo, passageiros, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
	}
	
	public void Acelerar(){
		if(isLigado == false) {
			System.out.println("N�o � possivel acelerar com o veiculo desligado!");
		}
		this.velocidade = 15;
		if(this.litrosCombustivel < 0) {
			System.out.println("Veiculo sem combustivel");
		}else {
			this.litrosCombustivel = -4;
		}
	}
	public void Abastecer(float litrosACombustivel){
		if(this.litrosCombustivel < 400) {
			this.litrosCombustivel = (int)litrosACombustivel;
		}else {
		System.out.println("O Veiculo est� com o tanque cheio!");
		}
	
	}
	
	public void imprime() {
		super.imprime();
	}
}