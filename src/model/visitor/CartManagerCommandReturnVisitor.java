
package model.visitor;

import persistence.*;

public interface CartManagerCommandReturnVisitor<R> {
    
    public R handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException;
    public R handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public R handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException;
    
}
