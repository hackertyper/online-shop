package view.objects;

import view.*;
import viewClient.*;

public abstract class DeliveryProxi extends ViewProxi implements DeliveryView{
    
    public DeliveryProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public long getRemainingTimeToDelivery()throws ModelException{
        return ((Delivery)this.getTheObject()).getRemainingTimeToDelivery();
    }
    public void setRemainingTimeToDelivery(long newValue) throws ModelException {
        ((Delivery)this.getTheObject()).setRemainingTimeToDelivery(newValue);
    }
    public java.util.Date getSendDate()throws ModelException{
        return ((Delivery)this.getTheObject()).getSendDate();
    }
    public void setSendDate(java.util.Date newValue) throws ModelException {
        ((Delivery)this.getTheObject()).setSendDate(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
