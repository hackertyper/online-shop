
package view.visitor;

import view.*;

public interface UserExceptionReturnVisitor<R> {
    
    public R handleCycleException(CycleException cycleException) throws ModelException;
    public R handleDoubleUsername(DoubleUsername doubleUsername) throws ModelException;
    public R handleFirstCheckOut(FirstCheckOut firstCheckOut) throws ModelException;
    public R handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException;
    public R handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException;
    public R handleInvalidOrderAmount(InvalidOrderAmount invalidOrderAmount) throws ModelException;
    public R handleInvalidStockNumber(InvalidStockNumber invalidStockNumber) throws ModelException;
    public R handleNotArrived(NotArrived notArrived) throws ModelException;
    public R handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    
}
