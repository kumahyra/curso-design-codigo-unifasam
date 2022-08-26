package oo_java.abstracao;

public class Carro extends Veiculo {

    public boolean ligado;	

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
	
	// Aqui, a classe Carro define como ela deve exercer o ato de acelerar
	@Override
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
	
	public boolean estaLigado() {
		return ligado;
	}
}