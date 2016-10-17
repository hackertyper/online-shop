
package model.visitor;

import persistence.*;

public interface ItemCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    
}
