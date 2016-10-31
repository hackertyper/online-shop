
package model.visitor;

import persistence.*;

public interface CartManagerCommandVisitor {
    
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException;
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException;
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException;
    
}
