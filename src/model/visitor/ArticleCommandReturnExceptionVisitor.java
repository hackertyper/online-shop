
package model.visitor;

import persistence.*;

public interface ArticleCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException, E;
    public R handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException, E;
    
}
