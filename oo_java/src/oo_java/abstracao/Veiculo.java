package oo_java.abstracao;

//Classe abstrata (não pode ser instanciada)
public abstract class Veiculo {

 private String modelo;
 private String marca;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	// Método abstrato: a classe Veiculo sabe que ela tem que acelerar, mas não sabe como fazer isso.
	// A responsabilidade passa a ser das classes-filha
	public abstract void acelerar();
	
}