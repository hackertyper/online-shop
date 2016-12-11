
package view.visitor;

import view.*;

public interface UserExceptionExceptionVisitor<E extends view.UserException> {
    
    public void handleCycleException(CycleException cycleException) throws ModelException, E;
    public void handleDuplicateUsername(DuplicateUsername duplicateUsername) throws ModelException, E;
    public void handleFirstCheckOut(FirstCheckOut firstCheckOut) throws ModelException, E;
    public void handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException, E;
    public void handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException, E;
    public void handleInvalidOrderAmount(InvalidOrderAmount invalidOrderAmount) throws ModelException, E;
    public void handleInvalidStockNumber(InvalidStockNumber invalidStockNumber) throws ModelException, E;
    public void handleNotArrived(NotArrived notArrived) throws ModelException, E;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    
}
