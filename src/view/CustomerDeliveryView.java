package view;

import view.objects.*;

import view.visitor.*;

public interface CustomerDeliveryView extends Anything, AbstractViewRoot {
    
    public long getTime()throws ModelException;
    public void setTime(long newValue) throws ModelException ;
    public long getExtraCharge()throws ModelException;
    public void setExtraCharge(long newValue) throws ModelException ;
    
    public void accept(CustomerDeliveryVisitor visitor) throws ModelException;
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

