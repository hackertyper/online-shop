
package view.visitor;

import view.*;

public interface UserExceptionReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCycleException(CycleException cycleException) throws ModelException, E;
    public R handleDuplicateUsername(DuplicateUsername duplicateUsername) throws ModelException, E;
    public R handleFirstCheckOut(FirstCheckOut firstCheckOut) throws ModelException, E;
    public R handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException, E;
    public R handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException, E;
    public R handleInvalidOrderAmount(InvalidOrderAmount invalidOrderAmount) throws ModelException, E;
    public R handleInvalidStockNumber(InvalidStockNumber invalidStockNumber) throws ModelException, E;
    public R handleNotArrived(NotArrived notArrived) throws ModelException, E;
    public R handleRestrictionException(RestrictionException restrictionException) throws ModelException, E;
    
}
