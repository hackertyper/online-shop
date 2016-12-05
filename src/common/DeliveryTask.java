package common;

import java.util.TimerTask;

import persistence.PersistenceException;
import persistence.PersistentDelivery;

public class DeliveryTask extends TimerTask {
	private PersistentDelivery delivery;
	
	public DeliveryTask(PersistentDelivery delivery) {
		this.delivery = delivery;
	}

	@Override
	public void run() {
		try {
			delivery.deliver();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

}
