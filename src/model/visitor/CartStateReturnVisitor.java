
package model.visitor;

import persistence.*;

public interface CartStateReturnVisitor<R> {
    
    public R handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException;
    public R handleOpenCart(PersistentOpenCart openCart) throws PersistenceException;
    
}
