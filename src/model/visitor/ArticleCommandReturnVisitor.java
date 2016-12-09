
package model.visitor;

import persistence.*;

public interface ArticleCommandReturnVisitor<R> {
    
    public R handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException;
    public R handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException;
    
}
