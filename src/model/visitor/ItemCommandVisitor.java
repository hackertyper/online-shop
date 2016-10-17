
package model.visitor;

import persistence.*;

public interface ItemCommandVisitor {
    
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    
}
