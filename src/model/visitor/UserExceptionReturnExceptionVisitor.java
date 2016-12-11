
package model.visitor;

import persistence.*;

public interface UserExceptionReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCycleException(model.CycleException cycleException) throws PersistenceException, E;
    public R handleDuplicateUsername(model.DuplicateUsername duplicateUsername) throws PersistenceException, E;
    public R handleFirstCheckOut(model.FirstCheckOut firstCheckOut) throws PersistenceException, E;
    public R handleInsufficientFunds(model.InsufficientFunds insufficientFunds) throws PersistenceException, E;
    public R handleInsufficientStock(model.InsufficientStock insufficientStock) throws PersistenceException, E;
    public R handleInvalidOrderAmount(model.InvalidOrderAmount invalidOrderAmount) throws PersistenceException, E;
    public R handleInvalidStockNumber(model.InvalidStockNumber invalidStockNumber) throws PersistenceException, E;
    public R handleNotArrived(model.NotArrived notArrived) throws PersistenceException, E;
    public R handleRestrictionException(model.RestrictionException restrictionException) throws PersistenceException, E;
    
}
