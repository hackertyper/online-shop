
package view.visitor;

import view.*;

public interface CartStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCheckedOut(CheckedOutView checkedOut) throws ModelException, E;
    public R handleOpenCart(OpenCartView openCart) throws ModelException, E;
    
}
