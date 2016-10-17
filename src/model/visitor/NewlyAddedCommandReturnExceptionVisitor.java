
package model.visitor;

import persistence.*;

public interface NewlyAddedCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    
}
