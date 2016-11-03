
package model.visitor;

import persistence.*;

public interface CartStateExceptionVisitor<E extends model.UserException> {
    
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException, E;
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException, E;
    
}
