package br.com.model;

public abstract class Veiculo {
	
	protected String modelo;
	protected int passageiros;
	protected String placa;
	protected String cor;
	protected float km;
	protected boolean isLigado;
	protected int litrosCombustivel;
	protected int velocidade;
	protected Double preco;
	
	public Veiculo() {
	}

	public Veiculo(String modelo, int passageiros, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {

		this.modelo = modelo;
		this.passageiros = passageiros;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getCombustivel() {
		return litrosCombustivel;
	}

	public void setCombustivel(int combustivel) {
		this.litrosCombustivel = combustivel;
	}
	
	

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	//METODOS
	
	public void Acelerar(){
		if(isLigado == false) {
			System.out.println("Não é possivel acelerar com o veiculo desligado!");
		}
		this.velocidade = 15;
		if(this.litrosCombustivel < 0) {
			System.out.println("Veiculo sem combustivel");
		}else {
			this.litrosCombustivel = -4;
		}
	}
	public void Abastecer(int litrosACombustivel){
		if(this.litrosCombustivel < 100) {
			this.litrosCombustivel = litrosACombustivel;
		}else {
		System.out.println("O Veiculo está com o tanque cheio!");
		}
	}
	public void imprime() {
		
		System.out.println("\nModelo:" + modelo + "\nPassageiros:" + passageiros +"\nPlaca:" + placa + "\n Cor:" + cor 
				+ "\n KM:" + km + "\nStatus:" + isLigado + "\n Listros de combustivel:" + litrosCombustivel  + "\nVelocidade:" 
	            + velocidade + "anPreço:" + preco);
	}
	
	
  
}
