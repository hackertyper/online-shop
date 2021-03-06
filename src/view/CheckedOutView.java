package view;

import view.visitor.*;

public interface CheckedOutView extends CartStateView {
    
    
    public void accept(CartStateVisitor visitor) throws ModelException;
    public <R> R accept(CartStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(CartStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(CartStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

