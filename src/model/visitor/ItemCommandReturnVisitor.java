
package model.visitor;

import persistence.*;

public interface ItemCommandReturnVisitor<R> {
    
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    
}
