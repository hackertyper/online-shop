
package view.visitor;

import view.*;

public interface UserExceptionVisitor {
    
    public void handleCycleException(CycleException cycleException) throws ModelException;
    public void handleDoubleUsername(DoubleUsername doubleUsername) throws ModelException;
    public void handleFirstCheckOut(FirstCheckOut firstCheckOut) throws ModelException;
    public void handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException;
    public void handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException;
    public void handleInvalidStockNumber(InvalidStockNumber invalidStockNumber) throws ModelException;
    public void handleNotArrived(NotArrived notArrived) throws ModelException;
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException;
    
}
