package dip.coderefactoring;

public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPayment(Object order, int amount) {
		bankCard.doTransaction(amount);
	}

	public static void main(String[] args) {
		BankCard bankCard = new CreditCard();
		ShoppingMall shoppingMall1 = new ShoppingMall(bankCard);
		shoppingMall1.doPayment("faça um pedido", 10000);
	}
}
