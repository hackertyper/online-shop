
package model.visitor;

import persistence.*;

public interface NewlyAddedCommandReturnVisitor<R> {
    
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    
}
