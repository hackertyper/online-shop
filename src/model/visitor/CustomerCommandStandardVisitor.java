
package model.visitor;

import persistence.*;

public abstract class CustomerCommandStandardVisitor implements CustomerCommandVisitor {
    
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException{
        this.standardHandling(orderCommand);
    }
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException{
        this.standardHandling(addToCartCommand);
    }
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException{
        this.standardHandling(findArticleCommand);
    }
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException{
        this.standardHandling(checkOutCommand);
    }
    public void handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException{
        this.standardHandling(payCommand);
    }
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    protected abstract void standardHandling(CustomerCommand customerCommand) throws PersistenceException;
}
