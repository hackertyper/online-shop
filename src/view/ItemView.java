package view;

import view.objects.*;

import view.visitor.*;

public interface ItemView extends Anything, AbstractViewRoot {
    
    public String getDescription()throws ModelException;
    public void setDescription(String newValue) throws ModelException ;
    
    public void accept(ItemVisitor visitor) throws ModelException;
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

