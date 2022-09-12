package withpattern.service;

import java.math.BigDecimal;

import withpattern.model.Pessoa;

public class Diretor implements CalculaSalario {
	public Pessoa calcularSalarioLiquido(Pessoa pessoa) {
		pessoa.setSalarioLiquido(pessoa.getSalarioBruto().add(new BigDecimal("200.00")).subtract(new BigDecimal("75.00")));
		return pessoa;
	}
}
