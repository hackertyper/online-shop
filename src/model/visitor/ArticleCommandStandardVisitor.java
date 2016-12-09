
package model.visitor;

import persistence.*;

public abstract class ArticleCommandStandardVisitor implements ArticleCommandVisitor {
    
    public void handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException{
        this.standardHandling(changeMinStockCommand);
    }
    public void handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException{
        this.standardHandling(changeMaxStockCommand);
    }
    protected abstract void standardHandling(ArticleCommand articleCommand) throws PersistenceException;
}
