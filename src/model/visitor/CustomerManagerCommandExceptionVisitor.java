
package model.visitor;

import persistence.*;

public interface CustomerManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}
