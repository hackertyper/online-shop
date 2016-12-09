package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class SendOrderProxi extends ViewProxi implements SendOrderView{
    
    public SendOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public SendOrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Date arrivalDate = (java.util.Date)resultTable.get("arrivalDate");
        SendOrderView result$$ = new SendOrder((java.util.Date)arrivalDate, this.getId(), this.getClassId());
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
    
    public java.util.Date getArrivalDate()throws ModelException{
        return ((SendOrder)this.getTheObject()).getArrivalDate();
    }
    public void setArrivalDate(java.util.Date newValue) throws ModelException {
        ((SendOrder)this.getTheObject()).setArrivalDate(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleSendOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSendOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSendOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSendOrder(this);
    }
    public void accept(CustomerOrderStateVisitor visitor) throws ModelException {
        visitor.handleSendOrder(this);
    }
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleSendOrder(this);
    }
    public <E extends view.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleSendOrder(this);
    }
    public <R, E extends view.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleSendOrder(this);
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
