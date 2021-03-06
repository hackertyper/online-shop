package view;

import view.objects.*;

import view.visitor.*;

public interface SendOrderView extends CustomerOrderState, Anything, AbstractViewRoot {
    
    public java.util.Date getArrivalDate()throws ModelException;
    public void setArrivalDate(java.util.Date newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(CustomerOrderStateVisitor visitor) throws ModelException;
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

