
package model.visitor;

import persistence.*;

public abstract class CartStateStandardVisitor implements CartStateVisitor {
    
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException{
        this.standardHandling(openCart);
    }
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException{
        this.standardHandling(checkedOut);
    }
    protected abstract void standardHandling(PersistentCartState cartState) throws PersistenceException;
}
