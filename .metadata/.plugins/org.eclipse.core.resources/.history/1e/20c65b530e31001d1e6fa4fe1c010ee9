package withpattern;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import withpattern.model.Pessoa;
import withpattern.service.CalculaSalario;
import withpattern.service.TipoCargo;

public class TestaFolhaPagamento {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
									
			System.out.println("Informe o salário bruto: ");
			BigDecimal salarioBruto = entrada.nextBigDecimal();
			
			System.out.println("Informe o cargo: \n 1 - COORDENADOR\n 2 - DIRETOR\n 3 - PROFESSOR");
			int opcaoCargo = entrada.nextInt();
			TipoCargo tipoCargo = TipoCargo.values()[opcaoCargo - 1];
		
			CalculaSalario calculaSalario = tipoCargo.calculaSalario();
			
			Pessoa pessoa = new Pessoa.Builder()
					.nome("João")
					.dataAdmissao(LocalDate.now())
					.cargo(tipoCargo)
					.salarioBruto(salarioBruto)
					.build();
			
			Pessoa pessoaCalculada = calculaSalario.calcularSalarioLiquido(pessoa);			
			
			System.out.printf("O Salário líquido do "
					.concat(pessoaCalculada.getNome())
					.concat(" com o cargo: ")
					.concat(pessoaCalculada.getCargo().name())
					.concat(" é R$%.2f"),
					pessoaCalculada.getSalarioLiquido());
		}
	}
}
