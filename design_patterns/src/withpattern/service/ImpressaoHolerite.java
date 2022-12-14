package withpattern.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import withpattern.model.Pessoa;

public class ImpressaoHolerite implements CalculaSalario{

	private CalculaSalario calculaSalario;
	
	public ImpressaoHolerite (CalculaSalario calculaSalario) {
		this.calculaSalario = calculaSalario;
	}
	
	@Override
	public Pessoa calcularSalarioLiquido(Pessoa pessoa) {
		Pessoa pessoaCalculado =  calculaSalario.calcularSalarioLiquido(pessoa);
		
		try(PrintStream write = new PrintStream(new FileOutputStream("holerite.txt", true))){
			write.println("Nome: " + pessoaCalculado.getNome() + 
					" Cargo: " + pessoaCalculado.getCargo() + 
					" Salário Bruto: " + pessoaCalculado.getSalarioBruto() + 
					" Salário Líqido: " + pessoaCalculado.getSalarioLiquido());
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Não foi possível salvar o arquivo", e);
		}
		
		return pessoaCalculado;
	}

}
