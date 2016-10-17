
package view.visitor;

import view.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleDoubleUsername(DoubleUsername doubleUsername) throws ModelException{
        this.standardHandling(doubleUsername);
    }
    public void handleInsufficientStock(InsufficientStock insufficientStock) throws ModelException{
        this.standardHandling(insufficientStock);
    }
    public void handleCycleException(CycleException cycleException) throws ModelException{
        this.standardHandling(cycleException);
    }
    public void handleRestrictionException(RestrictionException restrictionException) throws ModelException{
        this.standardHandling(restrictionException);
    }
    public void handleInsufficientFunds(InsufficientFunds insufficientFunds) throws ModelException{
        this.standardHandling(insufficientFunds);
    }
    protected abstract void standardHandling(UserException userException) throws ModelException;
}