
package model.visitor;

import persistence.*;

public abstract class RegisterService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    
}
