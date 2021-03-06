
package view.visitor;

import view.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleNotArrived(NotArrived notArrived) throws ModelException{
        this.standardHandling(notArrived);
    }
    public void handleInvalidStockNumber(InvalidStockNumber invalidStockNumber) throws ModelException{
        this.standardHandling(invalidStockNumber);
    }
    public void handleInvalidOrderAmount(InvalidOrderAmount invalidOrderAmount) throws ModelException{
        this.standardHandling(invalidOrderAmount);
    }
    public void handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException{
        this.standardHandling(insufficientStock);
    }
    public void handleCycleException(CycleException cycleException) throws ModelException{
        this.standardHandling(cycleException);
    }
    public void handleFirstCheckOut(FirstCheckOut firstCheckOut) throws ModelException{
        this.standardHandling(firstCheckOut);
    }
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException{
        this.standardHandling(restrictionException);
    }
    public void handleDuplicateUsername(DuplicateUsername duplicateUsername) throws ModelException{
        this.standardHandling(duplicateUsername);
    }
    public void handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException{
        this.standardHandling(insufficientFunds);
    }
    protected abstract void standardHandling(UserException userException) throws ModelException;
}
