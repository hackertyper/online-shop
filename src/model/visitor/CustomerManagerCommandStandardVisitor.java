
package model.visitor;

import persistence.*;

public abstract class CustomerManagerCommandStandardVisitor implements CustomerManagerCommandVisitor {
    
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    protected abstract void standardHandling(CustomerManagerCommand customerManagerCommand) throws PersistenceException;
}
