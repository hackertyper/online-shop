
package model.visitor;

import persistence.*;

public interface CartStateVisitor {
    
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException;
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException;
    
}
