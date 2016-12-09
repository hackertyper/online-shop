package serverConstants;

public class ErrorMessages {

	public static final String InsufficientStock = "Not enough articles in stock to process order. Please lower your article amount or choose to preorder.";
	public static final String InsufficientFunds = "Not enough money on account balance. Please deposit the difference before order.";
	public static final String DoubleUsername = "AccountName is already in use. Please choose another name.";
	public static final String FirstCheckOut = "Cart needs to be checked out before ordering.";
	public static final String NotArrived = "Order has yet to arrive. Please wait.";
	public static final String invalidStocknumbers = "Minimum stock number must be less or equal maximum!";
	public static final String reserveNegative = "Reserve must not be negative!";

	public ErrorMessages() {}
	
}
