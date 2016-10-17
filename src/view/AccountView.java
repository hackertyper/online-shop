package view;

import view.objects.*;

import view.visitor.*;

public interface AccountView extends Anything, AbstractViewRoot {
    
    public long getLowerLimit()throws ModelException;
    public void setLowerLimit(long newValue) throws ModelException ;
    public long getBalance()throws ModelException;
    public void setBalance(long newValue) throws ModelException ;
    public CustomerView getManager()throws ModelException;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

