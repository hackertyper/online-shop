
package model.visitor;

import persistence.*;

public interface CustomerCommandReturnVisitor<R> {
    
    public R handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public R handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
