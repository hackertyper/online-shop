
package model.visitor;

import persistence.*;

public interface UserExceptionVisitor {
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException;
    public void handleDoubleUsername(model.DoubleUsername doubleUsername) throws PersistenceException;
    public void handleFirstCheckOut(model.FirstCheckOut firstCheckOut) throws PersistenceException;
    public void handleInsufficientFunds(model.InsufficientFunds insufficientFunds) throws PersistenceException;
    public void handleInsufficientStock(model.InsufficientStock insufficientStock) throws PersistenceException;
    public void handleNotArrived(model.NotArrived notArrived) throws PersistenceException;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    
}
