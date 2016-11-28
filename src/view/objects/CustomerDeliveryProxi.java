package view.objects;

import view.*;
import viewClient.*;

public abstract class CustomerDeliveryProxi extends ViewProxi implements CustomerDeliveryView{
    
    public CustomerDeliveryProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public long getTime()throws ModelException{
        return ((CustomerDelivery)this.getTheObject()).getTime();
    }
    public void setTime(long newValue) throws ModelException {
        ((CustomerDelivery)this.getTheObject()).setTime(newValue);
    }
    public long getExtraCharge()throws ModelException{
        return ((CustomerDelivery)this.getTheObject()).getExtraCharge();
    }
    public void setExtraCharge(long newValue) throws ModelException {
        ((CustomerDelivery)this.getTheObject()).setExtraCharge(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
