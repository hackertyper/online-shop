
package view.visitor;

import view.*;

public interface CartStateReturnVisitor<R> {
    
    public R handleCheckedOut(CheckedOutView checkedOut) throws ModelException;
    public R handleOpenCart(OpenCartView openCart) throws ModelException;
    
}
