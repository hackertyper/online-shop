
package model.visitor;

import persistence.*;

public abstract class OrderManagerCommandStandardVisitor implements OrderManagerCommandVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException{
        this.standardHandling(acceptDeliveryCommand);
    }
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException{
        this.standardHandling(cancelCommand);
    }
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException{
        this.standardHandling(retoureDeliveryCommand);
    }
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException{
        this.standardHandling(preorderCommand);
    }
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException{
        this.standardHandling(retoureArticleCommand);
    }
    protected abstract void standardHandling(OrderManagerCommand orderManagerCommand) throws PersistenceException;
}
