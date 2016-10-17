package view;

import view.objects.*;

import view.visitor.*;

public interface CustomerView extends Anything, AbstractViewRoot {
    
    public AccountView getMyAccount()throws ModelException;
    public void setMyAccount(AccountView newValue) throws ModelException ;
    public CartView getMyCart()throws ModelException;
    public void setMyCart(CartView newValue) throws ModelException ;
    public java.util.Vector<ItemView> getItemRange()throws ModelException;
    public void setItemRange(java.util.Vector<ItemView> newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}
