
package model.visitor;

import persistence.*;

public interface CustomerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException, E;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public void handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException, E;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}