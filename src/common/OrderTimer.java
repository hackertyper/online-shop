package common;

import java.util.Timer;

import persistence.PersistenceException;

/**
 * Controller for tasks. Singleton.
 */
public final class OrderTimer{
	private Timer timer = new Timer();
	private static OrderTimer instance;
	
	private OrderTimer() {}
	
	/**
	 * @return instance of this object
	 */
	public synchronized static OrderTimer getInstance() {
		if (instance == null) {
			instance = new OrderTimer();
		}
		return instance;
	}
	
	/**
	 * Send action
	 * @param delivery - send delivery
	 * @param delay - time needed for delivery
	 * @throws PersistenceException
	 */
	public void send(DeliveryTask delivery, long delay) throws PersistenceException {
		timer.schedule(delivery, delay);
	}
	
	/**
	 * Deliver action
	 * @param task - task of the arrived delivery
	 * @param delay - time until automatic retoure
	 * @throws PersistenceException
	 */
	public void deliver(ArrivedTask task, long delay) throws PersistenceException {
		timer.schedule(task, delay);
	}
	
}
