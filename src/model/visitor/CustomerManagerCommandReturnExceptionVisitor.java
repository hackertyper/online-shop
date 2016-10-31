
package model.visitor;

import persistence.*;

public interface CustomerManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}
