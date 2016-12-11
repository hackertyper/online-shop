package view;

import view.objects.*;

import view.visitor.*;

public interface DeliveryView extends Anything, AbstractViewRoot {
    
    public long getRemainingTimeToDelivery()throws ModelException;
    public void setRemainingTimeToDelivery(long newValue) throws ModelException ;
    public java.util.Date getSentDate()throws ModelException;
    public void setSentDate(java.util.Date newValue) throws ModelException ;
    
    public void accept(DeliveryVisitor visitor) throws ModelException;
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

