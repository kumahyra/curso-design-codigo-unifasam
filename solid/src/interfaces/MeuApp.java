package interfaces;

public class MeuApp {
	public static void main(String[] args) {
		//POLIMORFISMO
		CrudDAO funcionarioDAO = new FuncionarioDAO();

		funcionarioDAO.salvar(funcionarioDAO);

		//INSTANCEOF
		FuncionarioDAO funcionario = new FuncionarioDAO();

		if (funcionario instanceof CrudDAO)
			funcionario.salvar(funcionario);
		else
			System.err.println("A Classe FuncionarioDAO não implementa BasicoDAO, nenhum procedimento foi realizado");

		
	}

}
