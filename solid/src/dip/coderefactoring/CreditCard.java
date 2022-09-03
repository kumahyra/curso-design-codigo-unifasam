package dip.coderefactoring;

public class CreditCard implements BankCard {
	public void doTransaction(int amount) {
		System.out.println("tx feito com CreditCard");
	}
}