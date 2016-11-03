
package view.visitor;

import view.*;

public interface CartStateExceptionVisitor<E extends view.UserException> {
    
    public void handleCheckedOut(CheckedOutView checkedOut) throws ModelException, E;
    public void handleOpenCart(OpenCartView openCart) throws ModelException, E;
    
}
