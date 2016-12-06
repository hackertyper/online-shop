
package model.visitor;

import persistence.*;

public interface OrderManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException, E;
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException, E;
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException, E;
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException, E;
    
}
