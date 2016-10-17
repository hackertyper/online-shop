package view;

import view.visitor.*;

public interface ProductGroupView extends ItemView {
    
    public java.util.Vector<ItemView> getItemList()throws ModelException;
    public void setItemList(java.util.Vector<ItemView> newValue) throws ModelException ;
    
    public void accept(ItemVisitor visitor) throws ModelException;
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

