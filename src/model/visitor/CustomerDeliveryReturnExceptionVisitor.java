
package model.visitor;

import persistence.*;

public interface CustomerDeliveryReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException, E;
    public R handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException, E;
    public R handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException, E;
    
}
