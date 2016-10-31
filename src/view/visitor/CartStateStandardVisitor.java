
package view.visitor;

import view.*;

public abstract class CartStateStandardVisitor implements CartStateVisitor {
    
    public void handleOpenCart(OpenCartView openCart) throws ModelException{
        this.standardHandling(openCart);
    }
    public void handleCheckedOut(CheckedOutView checkedOut) throws ModelException{
        this.standardHandling(checkedOut);
    }
    protected abstract void standardHandling(CartStateView cartState) throws ModelException;
}
