
package model.visitor;

import persistence.*;

public interface UserExceptionExceptionVisitor<E extends model.UserException> {
    
    public void handleCycleException(model.CycleException cycleException) throws PersistenceException, E;
    public void handleDoubleUsername(model.DoubleUsername doubleUsername) throws PersistenceException, E;
    public void handleFirstCheckOut(model.FirstCheckOut firstCheckOut) throws PersistenceException, E;
    public void handleInsufficientFunds(model.InsufficientFunds insufficientFunds) throws PersistenceException, E;
    public void handleInsufficientStock(model.InsufficientStock insufficientStock) throws PersistenceException, E;
    public void handleInvalidStockNumber(model.InvalidStockNumber invalidStockNumber) throws PersistenceException, E;
    public void handleNotArrived(model.NotArrived notArrived) throws PersistenceException, E;
    public void handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException, E;
    
}
