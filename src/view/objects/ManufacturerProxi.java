package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ManufacturerProxi extends ViewProxi implements ManufacturerView{
    
    public ManufacturerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ManufacturerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String name = (String)resultTable.get("name");
        long manuDelivery = new Long((String)resultTable.get("manuDelivery")).longValue();
        ManufacturerView result$$ = new Manufacturer((String)name,(long)manuDelivery, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 ;
    }
    public boolean isLeaf() throws ModelException {
        return true;
    }
    public int getIndexOfChild(Object child) throws ModelException {
        
        return -1;
    }
    
    public String getName()throws ModelException{
        return ((Manufacturer)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws ModelException {
        ((Manufacturer)this.getTheObject()).setName(newValue);
    }
    public long getManuDelivery()throws ModelException{
        return ((Manufacturer)this.getTheObject()).getManuDelivery();
    }
    public void setManuDelivery(long newValue) throws ModelException {
        ((Manufacturer)this.getTheObject()).setManuDelivery(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleManufacturer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleManufacturer(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleManufacturer(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleManufacturer(this);
    }
    
    public boolean hasTransientFields(){
        return false;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
