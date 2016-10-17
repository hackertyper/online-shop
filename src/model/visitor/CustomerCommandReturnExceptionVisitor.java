
package model.visitor;

import persistence.*;

public interface CustomerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException, E;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public R handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException, E;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}
