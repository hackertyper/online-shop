
package model.visitor;

import persistence.*;

public interface OrderManagerCommandReturnVisitor<R> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public R handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException;
    public R handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException;
    public R handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException;
    public R handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    
}
