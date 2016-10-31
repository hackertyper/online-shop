
package model.visitor;

import persistence.*;

public interface CartStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException, E;
    public R handleOpenCart(PersistentOpenCart openCart) throws PersistenceException, E;
    
}
