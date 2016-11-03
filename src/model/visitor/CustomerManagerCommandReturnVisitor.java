
package model.visitor;

import persistence.*;

public interface CustomerManagerCommandReturnVisitor<R> {
    
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
