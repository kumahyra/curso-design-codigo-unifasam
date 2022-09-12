package withpattern.service;

import java.math.BigDecimal;

import withpattern.model.Pessoa;

public class Cordenador implements CalculaSalario {
	public Pessoa calcularSalarioLiquido(Pessoa pessoa) {
		pessoa.setSalarioLiquido(pessoa.getSalarioBruto().add(new BigDecimal("100.00")).subtract(new BigDecimal("50.00")));
		return pessoa;
	}
}
