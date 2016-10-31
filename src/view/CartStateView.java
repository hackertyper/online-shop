package view;

import view.objects.*;

import view.visitor.*;

public interface CartStateView extends Anything, AbstractViewRoot {
    
    
    public void accept(CartStateVisitor visitor) throws ModelException;
    public <R> R accept(CartStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(CartStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(CartStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

