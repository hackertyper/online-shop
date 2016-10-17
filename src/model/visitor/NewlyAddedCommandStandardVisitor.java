
package model.visitor;

import persistence.*;

public abstract class NewlyAddedCommandStandardVisitor implements NewlyAddedCommandVisitor {
    
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    protected abstract void standardHandling(NewlyAddedCommand newlyAddedCommand) throws PersistenceException;
}
