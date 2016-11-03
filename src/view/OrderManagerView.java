package view;

import view.objects.*;

import view.visitor.*;

public interface OrderManagerView extends Anything, AbstractViewRoot {
    
    public java.util.Vector<CustomerOrderView> getOrders()throws ModelException;
    public void setOrders(java.util.Vector<CustomerOrderView> newValue) throws ModelException ;
    public long getRetourePrice()throws ModelException;
    public void setRetourePrice(long newValue) throws ModelException ;
    public CustomerManagerView getCustomerManager()throws ModelException;
    public OrderServiceView getMyOrderServer()throws ModelException;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

