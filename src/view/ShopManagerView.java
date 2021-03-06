package view;

import view.objects.*;

import view.visitor.*;

public interface ShopManagerView extends Anything, AbstractViewRoot {
    
    public java.util.Vector<ItemView> getItemRange()throws ModelException;
    public void setItemRange(java.util.Vector<ItemView> newValue) throws ModelException ;
    public CustomerManagerView getCustomerManager()throws ModelException;
    public ShopServiceView getMyShopServer()throws ModelException;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

