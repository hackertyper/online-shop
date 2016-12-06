package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class PreOrderProxi extends ViewProxi implements PreOrderView{
    
    public PreOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public PreOrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi order = null;
        String order$String = (String)resultTable.get("order");
        if (order$String != null) {
            common.ProxiInformation order$Info = common.RPCConstantsAndServices.createProxiInformation(order$String);
            order = view.objects.ViewProxi.createProxi(order$Info,connectionKey);
            order.setToString(order$Info.getToString());
        }
        PreOrderView result$$ = new PreOrder((CustomerOrderView)order, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getOrder() != null) return new OrderPreOrderWrapper(this, originalIndex, (ViewRoot)this.getOrder());
        if(this.getOrder() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getOrder() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getOrder() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getOrder() != null && this.getOrder().equals(child)) return result;
        if(this.getOrder() != null) result = result + 1;
        return -1;
    }
    
    public CustomerOrderView getOrder()throws ModelException{
        return ((PreOrder)this.getTheObject()).getOrder();
    }
    public void setOrder(CustomerOrderView newValue) throws ModelException {
        ((PreOrder)this.getTheObject()).setOrder(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handlePreOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handlePreOrder(this);
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
