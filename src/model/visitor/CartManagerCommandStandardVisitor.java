
package model.visitor;

import persistence.*;

public abstract class CartManagerCommandStandardVisitor implements CartManagerCommandVisitor {
    
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException{
        this.standardHandling(orderCommand);
    }
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException{
        this.standardHandling(removeFCartCommand);
    }
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
    }
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException{
        this.standardHandling(checkOutCommand);
    }
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException{
        this.standardHandling(changeAmountCommand);
    }
    protected abstract void standardHandling(CartManagerCommand cartManagerCommand) throws PersistenceException;
}
