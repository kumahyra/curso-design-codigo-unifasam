package dip.coderefactoring;

public class Pix implements BankCard {

	@Override
	public void doTransaction(int amount) {
		System.out.println("Pagamento feito com pix.");
		
	}

}
