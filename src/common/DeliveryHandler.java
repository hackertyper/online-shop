package common;

import persistence.PersistenceException;
import persistence.PersistentDelivery;

public class DeliveryHandler implements Runnable {
	private static PersistentDelivery delivery;
	
	public DeliveryHandler(PersistentDelivery delivery) {
		DeliveryHandler.delivery = delivery;
	}

	@Override
	public void run() {
    	try {
			try {
				Thread.sleep(delivery.getRemainingTimeToDelivery());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			delivery.deliver();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
    	
	}

}
