
package model.visitor;

import persistence.*;

public interface CartManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException, E;
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException, E;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException, E;
    
}
