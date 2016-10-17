
package model.visitor;

import persistence.*;

public abstract class ArticleCommandStandardVisitor implements ArticleCommandVisitor {
    
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException{
        this.standardHandling(changeProductGroupCommand);
    }
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException{
        this.standardHandling(changeManuDeliveryCommand);
    }
    protected abstract void standardHandling(ArticleCommand articleCommand) throws PersistenceException;
}
