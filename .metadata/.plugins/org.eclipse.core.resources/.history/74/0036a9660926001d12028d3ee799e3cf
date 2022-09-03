package oo_java.encapsulamento;

public class Carro {
	public String modelo;
	public String marca;
	public String cor;
	private String placa;
	private boolean ligado;
	 
	public Carro() {
		ligado = false;
	}

    public void ligar() {
		ligado = true;
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
		ligado = false;
        System.out.println("O veículo desligou!");
    }
	
	public void acelerar() {
		if (!ligado){
			try {
				throw new Exception("O carro não pode ser acelerado, pois ele está desligado.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Erro: o carro está desligado!
		}
		System.out.println("O carro foi acelerado");
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
}
