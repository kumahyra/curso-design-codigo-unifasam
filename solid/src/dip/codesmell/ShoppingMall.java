package dip.codesmell;

public class ShoppingMall {
	private DebitCard debitCard;
	public ShoppingMall(DebitCard debitCard) {
	        this.debitCard = debitCard;
	   }
	public void doPayment(Object order, int amount){              
		debitCard.doTransaction(amount); 
	 }
	public static void main(String[] args) {
	     DebitCard debitCard=new DebitCard();
	     ShoppingMall shoppingMall=new ShoppingMall(debitCard);
	     shoppingMall.doPayment("algum pedido",5000);
	    }
}
