
package model.visitor;

import persistence.*;

public abstract class UserExceptionStandardVisitor implements UserExceptionVisitor {
    
    public void handleNotArrived(model.NotArrived notArrived) throws PersistenceException{
        this.standardHandling(notArrived);
    }
    public void handleDoubleUsername(model.DoubleUsername doubleUsername) throws PersistenceException{
        this.standardHandling(doubleUsername);
    }
    public void handleInvalidStockNumber(model.InvalidStockNumber invalidStockNumber) throws PersistenceException{
        this.standardHandling(invalidStockNumber);
    }
    public void handleInsufficientStock(model.InsufficientStock insufficientStock) throws PersistenceException{
        this.standardHandling(insufficientStock);
    }
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException{
        this.standardHandling(cycleException);
    }
    public void handleFirstCheckOut(model.FirstCheckOut firstCheckOut) throws PersistenceException{
        this.standardHandling(firstCheckOut);
    }
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException{
        this.standardHandling(restrictionException);
    }
    public void handleInsufficientFunds(model.InsufficientFunds insufficientFunds) throws PersistenceException{
        this.standardHandling(insufficientFunds);
    }
    protected abstract void standardHandling(model.UserException userException) throws PersistenceException;
}
