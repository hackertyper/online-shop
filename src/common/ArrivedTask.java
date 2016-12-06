package common;

import java.util.TimerTask;

import model.InsufficientFunds;
import model.NotArrived;
import persistence.PersistenceException;
import persistence.PersistentCustomerOrder;

public class ArrivedTask extends TimerTask {
	private static PersistentCustomerOrder order;
	
	public ArrivedTask(PersistentCustomerOrder order) {
		ArrivedTask.order = order;
	}

	@Override
	public void run() {
		try {
			order.getOrdermngr().retoureDelivery(order);
		} catch (PersistenceException | InsufficientFunds | NotArrived e) {
			e.printStackTrace();
		}
	}

}
