
package model.visitor;

import persistence.*;

public abstract class CustomerDeliveryStandardVisitor implements CustomerDeliveryVisitor {
    
    public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException{
        this.standardHandling(testDelivery);
    }
    public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException{
        this.standardHandling(overNightDelivery);
    }
    public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException{
        this.standardHandling(standardDelivery);
    }
    protected abstract void standardHandling(PersistentCustomerDelivery customerDelivery) throws PersistenceException;
}
