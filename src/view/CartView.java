package view;

import view.objects.*;

import view.visitor.*;

public interface CartView extends Anything, AbstractViewRoot {
    
    public long getCurrentSum()throws ModelException;
    public void setCurrentSum(long newValue) throws ModelException ;
    public CartStateView getState()throws ModelException;
    public void setState(CartStateView newValue) throws ModelException ;
    public CartManagerView getCartMngr()throws ModelException;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

