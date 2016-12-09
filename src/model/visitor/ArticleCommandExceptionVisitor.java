
package model.visitor;

import persistence.*;

public interface ArticleCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException, E;
    public void handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException, E;
    
}
