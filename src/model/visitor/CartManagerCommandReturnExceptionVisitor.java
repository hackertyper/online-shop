
package model.visitor;

import persistence.*;

public interface CartManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException, E;
    public R handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException, E;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public R handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException, E;
    
}
