
package model.visitor;

import persistence.*;

public interface UserExceptionReturnVisitor<R> {
    
    public R handleCycleException(model.CycleException cycleException) throws PersistenceException;
    public R handleDoubleUsername(model.DoubleUsername doubleUsername) throws PersistenceException;
    public R handleFirstCheckOut(model.FirstCheckOut firstCheckOut) throws PersistenceException;
    public R handleInsufficientFunds(model.InsufficientFunds insufficientFunds) throws PersistenceException;
    public R handleInsufficientStock(model.InsufficientStock insufficientStock) throws PersistenceException;
    public R handleInvalidStockNumber(model.InvalidStockNumber invalidStockNumber) throws PersistenceException;
    public R handleNotArrived(model.NotArrived notArrived) throws PersistenceException;
    public R handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException;
    
}
