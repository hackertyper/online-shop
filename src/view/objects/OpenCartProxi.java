package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OpenCartProxi extends CartStateProxi implements OpenCartView{
    
    public OpenCartProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public OpenCartView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        OpenCartView result$$ = new OpenCart( this.getId(), this.getClassId());
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
    
    
    public void accept(CartStateVisitor visitor) throws ModelException {
        visitor.handleOpenCart(this);
    }
    public <R> R accept(CartStateReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOpenCart(this);
    }
    public <E extends view.UserException>  void accept(CartStateExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOpenCart(this);
    }
    public <R, E extends view.UserException> R accept(CartStateReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOpenCart(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOpenCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOpenCart(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOpenCart(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOpenCart(this);
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
