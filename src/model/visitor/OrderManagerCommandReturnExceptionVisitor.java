
package model.visitor;

import persistence.*;

public interface OrderManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public R handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException, E;
    public R handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException, E;
    public R handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException, E;
    public R handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException, E;
    
}
