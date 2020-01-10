package br.com.model;


public class Carro extends Veiculo{
	
	public String marca;
	private int portas;
	private String ano;
	
	
	public Carro() {
	}

	public Carro(String modelo, int passageiros, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco, String marca, int portas, String ano) {
		super(modelo, passageiros, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void imprime() {
		
		super.imprime();
		System.out.println("\nMarca:" + marca + "\nPortas:" + portas +"\nAno:"+ ano);
	}

}
