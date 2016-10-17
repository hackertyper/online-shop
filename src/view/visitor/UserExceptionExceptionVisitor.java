
package view.visitor;

import view.*;

public interface UserExceptionExceptionVisitor<E extends view.UserException> {
    
    public void handleCycleException(CycleException cycleException) throws ModelException, E;
    public void handleDoubleUsername(DoubleUsername doubleUsername) throws ModelException, E;
    public void handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException, E;
    public void handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException, E;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    
}
