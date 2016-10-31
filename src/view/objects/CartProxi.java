package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CartProxi extends ViewProxi implements CartView{
    
    public CartProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public CartView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long currentSum = new Long((String)resultTable.get("currentSum")).longValue();
        ViewProxi state = null;
        String state$String = (String)resultTable.get("state");
        if (state$String != null) {
            common.ProxiInformation state$Info = common.RPCConstantsAndServices.createProxiInformation(state$String);
            state = view.objects.ViewProxi.createProxi(state$Info,connectionKey);
            state.setToString(state$Info.getToString());
        }
        ViewProxi cartMngr = null;
        String cartMngr$String = (String)resultTable.get("cartMngr");
        if (cartMngr$String != null) {
            common.ProxiInformation cartMngr$Info = common.RPCConstantsAndServices.createProxiInformation(cartMngr$String);
            cartMngr = view.objects.ViewProxi.createProxi(cartMngr$Info,connectionKey);
            cartMngr.setToString(cartMngr$Info.getToString());
        }
        CartView result$$ = new Cart((long)currentSum,(CartStateView)state,(CartManagerView)cartMngr, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getState() != null && index < this.getState().getTheObject().getChildCount())
            return this.getState().getTheObject().getChild(index);
        if(this.getState() != null) index = index - this.getState().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getState() == null ? 0 : this.getState().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getState() == null ? true : this.getState().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getState() != null && this.getState().equals(child)) return result;
        if(this.getState() != null) result = result + 1;
        return -1;
    }
    
    public long getCurrentSum()throws ModelException{
        return ((Cart)this.getTheObject()).getCurrentSum();
    }
    public void setCurrentSum(long newValue) throws ModelException {
        ((Cart)this.getTheObject()).setCurrentSum(newValue);
    }
    public CartStateView getState()throws ModelException{
        return ((Cart)this.getTheObject()).getState();
    }
    public void setState(CartStateView newValue) throws ModelException {
        ((Cart)this.getTheObject()).setState(newValue);
    }
    public CartManagerView getCartMngr()throws ModelException{
        return ((Cart)this.getTheObject()).getCartMngr();
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCart(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCart(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCart(this);
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
