
package model.visitor;

import persistence.*;

public interface CustomerDeliveryVisitor {
    
    public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException;
    public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException;
    public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException;
    
}
