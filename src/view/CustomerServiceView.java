package view;

import viewClient.*;

import view.visitor.*;

public interface CustomerServiceView extends ServiceView {
    
    public CustomerView getManager()throws ModelException;
    public void setManager(CustomerView newValue) throws ModelException ;
    
    public void accept(ServiceVisitor visitor) throws ModelException;
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(RemoteVisitor visitor) throws ModelException;
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
    public CustomerServiceConnection connectCustomerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException;
}

