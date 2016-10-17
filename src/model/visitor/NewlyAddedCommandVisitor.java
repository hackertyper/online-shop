
package model.visitor;

import persistence.*;

public interface NewlyAddedCommandVisitor {
    
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    
}
