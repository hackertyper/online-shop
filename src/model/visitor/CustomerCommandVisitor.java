
package model.visitor;

import persistence.*;

public interface CustomerCommandVisitor {
    
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public void handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
