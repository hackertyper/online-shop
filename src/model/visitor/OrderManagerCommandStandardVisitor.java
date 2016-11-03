
package model.visitor;

import persistence.*;

public abstract class OrderManagerCommandStandardVisitor implements OrderManagerCommandVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException{
        this.standardHandling(acceptDeliveryCommand);
    }
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException{
        this.standardHandling(retoureDeliveryCommand);
    }
    protected abstract void standardHandling(OrderManagerCommand orderManagerCommand) throws PersistenceException;
}
