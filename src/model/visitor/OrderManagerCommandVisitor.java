
package model.visitor;

import persistence.*;

public interface OrderManagerCommandVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException;
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException;
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException;
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    
}
