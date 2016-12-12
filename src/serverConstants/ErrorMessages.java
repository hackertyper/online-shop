package serverConstants;

public class ErrorMessages {

	public static final String InsufficientStock = "Nicht ausreichend Artikel im Lager. Bitte reduzieren Sie die Artikelmenge.";
	public static final String InsufficientFunds = "Sie haben nicht ausreichend Guthaben auf Ihrem Konto. Bitte zahlen Sie vor dem Bestellen etwas ein.";
	public static final String DoubleUsername = "Der von Ihnen gewählte Name ist bereits vergeben. Bitte wählen Sie einen anderen.";
	public static final String FirstCheckOut = "Bitte gehen Sie erst zur Kasse bevor Sie bestellen.";
	public static final String NotArrived = "Ihre Bestellung ist noch nicht angekommen. Bitte warten Sie.";
	public static final String invalidStocknumbers = "Minimallagerbestand muss weniger oder gleich dem Maximallagerbestand sein!";
	public static final String reserveNegative = "Achten Sie darauf das Reserve nicht negativ ist!";
	public static final String InvalidOrderAmount = "Die Bestellmenge muss mindestens 1 sein!";
	public static final String CartPreorder = "Einkaufswagen wurde vorbestellt. Vorbestellung einsehbar unter Bestellungen.";

	public ErrorMessages() {}
	
}
