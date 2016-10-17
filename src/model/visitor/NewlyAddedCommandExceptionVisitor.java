
package model.visitor;

import persistence.*;

public interface NewlyAddedCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    
}
