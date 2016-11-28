package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OverNightDeliveryProxi extends CustomerDeliveryProxi implements OverNightDeliveryView{
    
    public OverNightDeliveryProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OverNightDeliveryView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long time = new Long((String)resultTable.get("time")).longValue();
        long extraCharge = new Long((String)resultTable.get("extraCharge")).longValue();
        OverNightDeliveryView result$$ = new OverNightDelivery((long)time,(long)extraCharge, this.getId(), this.getClassId());
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
    
    
    public void accept(CustomerDeliveryVisitor visitor) throws ModelException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends view.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends view.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOverNightDelivery(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOverNightDelivery(this);
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
