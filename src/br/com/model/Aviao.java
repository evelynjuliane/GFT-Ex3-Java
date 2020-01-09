package br.com.model;


public class Aviao extends Veiculo {

	private String tipo;
	private String uso;
	
	//CONSTRUTORES
	
	public Aviao() {
		super();
	}
	
	public Aviao(String modelo, int passageiros, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco, String tipo, String uso) {
		super(modelo, passageiros, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		
		this.tipo = tipo;
		this.uso = uso;
	}

	//GETTERS AND SETTERS
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void Acelerar(){
		if(isLigado == false) {
			System.out.println("Não é possivel acelerar com o avião desligado!");
		}
		this.velocidade = 1000;
		if(this.litrosCombustivel < 0) {
			System.out.println("Veiculo sem combustivel");
		}else {
			this.litrosCombustivel = -10;
		}
	}
	
	public void Abastecer(String litrosACombustivel){
		super.Abastecer(Integer.parseInt(litrosACombustivel));
	}
	
	public void imprime() {
		System.out.println(getModelo() +"\n"+ getPassageiros() + "\n" + tipo + "\n" + uso);
	}
	
	
}
