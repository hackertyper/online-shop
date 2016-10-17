
package model.visitor;

import persistence.*;

public interface ItemCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    
}
