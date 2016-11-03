
package model.visitor;

import persistence.*;

public interface CustomerManagerCommandVisitor {
    
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
