
package model.visitor;

import persistence.*;

public interface CustomerManagerCommandVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
