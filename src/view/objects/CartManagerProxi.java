package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CartManagerProxi extends ViewProxi implements CartManagerView{
    
    public CartManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public CartManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi myCart = null;
        String myCart$String = (String)resultTable.get("myCart");
        if (myCart$String != null) {
            common.ProxiInformation myCart$Info = common.RPCConstantsAndServices.createProxiInformation(myCart$String);
            myCart = view.objects.ViewProxi.createProxi(myCart$Info,connectionKey);
            myCart.setToString(myCart$Info.getToString());
        }
        CartManagerView result$$ = new CartManager((CartView)myCart, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getMyCart() != null) return new MyCartCartManagerWrapper(this, originalIndex, (ViewRoot)this.getMyCart());
        if(this.getMyCart() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyCart() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getMyCart() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyCart() != null && this.getMyCart().equals(child)) return result;
        if(this.getMyCart() != null) result = result + 1;
        return -1;
    }
    
    public CartView getMyCart()throws ModelException{
        return ((CartManager)this.getTheObject()).getMyCart();
    }
    public void setMyCart(CartView newValue) throws ModelException {
        ((CartManager)this.getTheObject()).setMyCart(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCartManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCartManager(this);
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
