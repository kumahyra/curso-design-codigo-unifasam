package dip.coderefactoring;

public class DebitCard implements BankCard {
	public void doTransaction(int amount) {
		System.out.println("pagamento feito com DebitCard");
	}
}