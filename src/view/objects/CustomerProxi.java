package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CustomerProxi extends ViewProxi implements CustomerView{
    
    public CustomerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public CustomerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi myAccount = null;
        String myAccount$String = (String)resultTable.get("myAccount");
        if (myAccount$String != null) {
            common.ProxiInformation myAccount$Info = common.RPCConstantsAndServices.createProxiInformation(myAccount$String);
            myAccount = view.objects.ViewProxi.createProxi(myAccount$Info,connectionKey);
            myAccount.setToString(myAccount$Info.getToString());
        }
        ViewProxi myCart = null;
        String myCart$String = (String)resultTable.get("myCart");
        if (myCart$String != null) {
            common.ProxiInformation myCart$Info = common.RPCConstantsAndServices.createProxiInformation(myCart$String);
            myCart = view.objects.ViewProxi.createProxi(myCart$Info,connectionKey);
            myCart.setToString(myCart$Info.getToString());
        }
        java.util.Vector<String> itemRange_string = (java.util.Vector<String>)resultTable.get("itemRange");
        java.util.Vector<ItemView> itemRange = ViewProxi.getProxiVector(itemRange_string, connectionKey);
        CustomerView result$$ = new Customer((AccountView)myAccount,(CartView)myCart,itemRange, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getMyAccount() != null && index < this.getMyAccount().getTheObject().getChildCount())
            return this.getMyAccount().getTheObject().getChild(index);
        if(this.getMyAccount() != null) index = index - this.getMyAccount().getTheObject().getChildCount();
        if(this.getMyCart() != null && index < this.getMyCart().getTheObject().getChildCount())
            return this.getMyCart().getTheObject().getChild(index);
        if(this.getMyCart() != null) index = index - this.getMyCart().getTheObject().getChildCount();
        if(index < this.getItemRange().size()) return new ItemRangeCustomerWrapper(this, originalIndex, (ViewRoot)this.getItemRange().get(index));
        index = index - this.getItemRange().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyAccount() == null ? 0 : this.getMyAccount().getTheObject().getChildCount())
            + (this.getMyCart() == null ? 0 : this.getMyCart().getTheObject().getChildCount())
            + (this.getItemRange().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getMyAccount() == null ? true : this.getMyAccount().getTheObject().isLeaf())
            && (this.getMyCart() == null ? true : this.getMyCart().getTheObject().isLeaf())
            && (this.getItemRange().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyAccount() != null && this.getMyAccount().equals(child)) return result;
        if(this.getMyAccount() != null) result = result + 1;
        if(this.getMyCart() != null && this.getMyCart().equals(child)) return result;
        if(this.getMyCart() != null) result = result + 1;
        java.util.Iterator<?> getItemRangeIterator = this.getItemRange().iterator();
        while(getItemRangeIterator.hasNext()){
            if(getItemRangeIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public AccountView getMyAccount()throws ModelException{
        return ((Customer)this.getTheObject()).getMyAccount();
    }
    public void setMyAccount(AccountView newValue) throws ModelException {
        ((Customer)this.getTheObject()).setMyAccount(newValue);
    }
    public CartView getMyCart()throws ModelException{
        return ((Customer)this.getTheObject()).getMyCart();
    }
    public void setMyCart(CartView newValue) throws ModelException {
        ((Customer)this.getTheObject()).setMyCart(newValue);
    }
    public java.util.Vector<ItemView> getItemRange()throws ModelException{
        return ((Customer)this.getTheObject()).getItemRange();
    }
    public void setItemRange(java.util.Vector<ItemView> newValue) throws ModelException {
        ((Customer)this.getTheObject()).setItemRange(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomer(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomer(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomer(this);
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
