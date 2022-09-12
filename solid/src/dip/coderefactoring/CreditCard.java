package dip.coderefactoring;

public class CreditCard implements BankCard {
	public void doTransaction(int amount) {
		System.out.println("pagamento feito com CreditCard");
	}
}