
package model.visitor;

import persistence.*;

public interface CustomerDeliveryReturnVisitor<R> {
    
    public R handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException;
    public R handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException;
    public R handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException;
    
}
