package view.objects;

import view.*;
import viewClient.*;

public abstract class ItemProxi extends ViewProxi implements ItemView{
    
    public ItemProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    
    public String getDescription()throws ModelException{
        return ((Item)this.getTheObject()).getDescription();
    }
    public void setDescription(String newValue) throws ModelException {
        ((Item)this.getTheObject()).setDescription(newValue);
    }
    
    
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
