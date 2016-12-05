
package model.visitor;

import persistence.*;

public interface OrderManagerCommandVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException;
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    
}
