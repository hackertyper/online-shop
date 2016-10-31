
package view.visitor;

import view.*;

public interface CartStateVisitor {
    
    public void handleCheckedOut(CheckedOutView checkedOut) throws ModelException;
    public void handleOpenCart(OpenCartView openCart) throws ModelException;
    
}
