package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ArrivedOrderProxi extends ViewProxi implements ArrivedOrderView{
    
    public ArrivedOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ArrivedOrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long timtToAccept = new Long((String)resultTable.get("timtToAccept")).longValue();
        ArrivedOrderView result$$ = new ArrivedOrder((long)timtToAccept, this.getId(), this.getClassId());
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
    
    public long getTimtToAccept()throws ModelException{
        return ((ArrivedOrder)this.getTheObject()).getTimtToAccept();
    }
    public void setTimtToAccept(long newValue) throws ModelException {
        ((ArrivedOrder)this.getTheObject()).setTimtToAccept(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArrivedOrder(this);
    }
    public void accept(CustomerOrderStateVisitor visitor) throws ModelException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends view.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends view.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArrivedOrder(this);
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
