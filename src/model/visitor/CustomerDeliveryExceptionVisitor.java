
package model.visitor;

import persistence.*;

public interface CustomerDeliveryExceptionVisitor<E extends model.UserException> {
    
    public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException, E;
    public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException, E;
    public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException, E;
    
}
