
package model.visitor;

import persistence.*;

public abstract class ItemCommandStandardVisitor implements ItemCommandVisitor {
    
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException{
        this.standardHandling(changeDescriptionCommand);
    }
    protected abstract void standardHandling(ItemCommand itemCommand) throws PersistenceException;
}
