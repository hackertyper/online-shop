package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CartManagerProxi extends ViewProxi implements CartManagerView{
    
    public CartManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public CartManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi myCart = null;
        String myCart$String = (String)resultTable.get("myCart");
        if (myCart$String != null) {
            common.ProxiInformation myCart$Info = common.RPCConstantsAndServices.createProxiInformation(myCart$String);
            myCart = view.objects.ViewProxi.createProxi(myCart$Info,connectionKey);
            myCart.setToString(myCart$Info.getToString());
        }
        java.util.Vector<String> articleList_string = (java.util.Vector<String>)resultTable.get("articleList");
        java.util.Vector<QuantifiedArticlesView> articleList = ViewProxi.getProxiVector(articleList_string, connectionKey);
        ViewProxi standardDelivery = null;
        String standardDelivery$String = (String)resultTable.get("standardDelivery");
        if (standardDelivery$String != null) {
            common.ProxiInformation standardDelivery$Info = common.RPCConstantsAndServices.createProxiInformation(standardDelivery$String);
            standardDelivery = view.objects.ViewProxi.createProxi(standardDelivery$Info,connectionKey);
            standardDelivery.setToString(standardDelivery$Info.getToString());
        }
        ViewProxi onDelivery = null;
        String onDelivery$String = (String)resultTable.get("onDelivery");
        if (onDelivery$String != null) {
            common.ProxiInformation onDelivery$Info = common.RPCConstantsAndServices.createProxiInformation(onDelivery$String);
            onDelivery = view.objects.ViewProxi.createProxi(onDelivery$Info,connectionKey);
            onDelivery.setToString(onDelivery$Info.getToString());
        }
        ViewProxi preOrder = null;
        String preOrder$String = (String)resultTable.get("preOrder");
        if (preOrder$String != null) {
            common.ProxiInformation preOrder$Info = common.RPCConstantsAndServices.createProxiInformation(preOrder$String);
            preOrder = view.objects.ViewProxi.createProxi(preOrder$Info,connectionKey);
            preOrder.setToString(preOrder$Info.getToString());
        }
        ViewProxi customerManager = null;
        String customerManager$String = (String)resultTable.get("customerManager");
        if (customerManager$String != null) {
            common.ProxiInformation customerManager$Info = common.RPCConstantsAndServices.createProxiInformation(customerManager$String);
            customerManager = view.objects.ViewProxi.createProxi(customerManager$Info,connectionKey);
            customerManager.setToString(customerManager$Info.getToString());
        }
        ViewProxi myCartServer = null;
        String myCartServer$String = (String)resultTable.get("myCartServer");
        if (myCartServer$String != null) {
            common.ProxiInformation myCartServer$Info = common.RPCConstantsAndServices.createProxiInformation(myCartServer$String);
            myCartServer = view.objects.ViewProxi.createProxi(myCartServer$Info,connectionKey);
            myCartServer.setToString(myCartServer$Info.getToString());
        }
        CartManagerView result$$ = new CartManager((CartView)myCart,articleList,(StandardDeliveryView)standardDelivery,(OverNightDeliveryView)onDelivery,(PreOrderView)preOrder,(CustomerManagerView)customerManager,(CartServiceView)myCartServer, this.getId(), this.getClassId());
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
        if(index < this.getArticleList().size()) return new ArticleListCartManagerWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        if(index == 0 && this.getStandardDelivery() != null) return new StandardDeliveryCartManagerWrapper(this, originalIndex, (ViewRoot)this.getStandardDelivery());
        if(this.getStandardDelivery() != null) index = index - 1;
        if(index == 0 && this.getOnDelivery() != null) return new OnDeliveryCartManagerWrapper(this, originalIndex, (ViewRoot)this.getOnDelivery());
        if(this.getOnDelivery() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getMyCart() == null ? 0 : 1)
            + (this.getArticleList().size())
            + (this.getStandardDelivery() == null ? 0 : 1)
            + (this.getOnDelivery() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getMyCart() == null ? true : false)
            && (this.getArticleList().size() == 0)
            && (this.getStandardDelivery() == null ? true : false)
            && (this.getOnDelivery() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getMyCart() != null && this.getMyCart().equals(child)) return result;
        if(this.getMyCart() != null) result = result + 1;
        java.util.Iterator<?> getArticleListIterator = this.getArticleList().iterator();
        while(getArticleListIterator.hasNext()){
            if(getArticleListIterator.next().equals(child)) return result;
            result = result + 1;
        }
        if(this.getStandardDelivery() != null && this.getStandardDelivery().equals(child)) return result;
        if(this.getStandardDelivery() != null) result = result + 1;
        if(this.getOnDelivery() != null && this.getOnDelivery().equals(child)) return result;
        if(this.getOnDelivery() != null) result = result + 1;
        return -1;
    }
    
    public CartView getMyCart()throws ModelException{
        return ((CartManager)this.getTheObject()).getMyCart();
    }
    public void setMyCart(CartView newValue) throws ModelException {
        ((CartManager)this.getTheObject()).setMyCart(newValue);
    }
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return ((CartManager)this.getTheObject()).getArticleList();
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        ((CartManager)this.getTheObject()).setArticleList(newValue);
    }
    public StandardDeliveryView getStandardDelivery()throws ModelException{
        return ((CartManager)this.getTheObject()).getStandardDelivery();
    }
    public void setStandardDelivery(StandardDeliveryView newValue) throws ModelException {
        ((CartManager)this.getTheObject()).setStandardDelivery(newValue);
    }
    public OverNightDeliveryView getOnDelivery()throws ModelException{
        return ((CartManager)this.getTheObject()).getOnDelivery();
    }
    public void setOnDelivery(OverNightDeliveryView newValue) throws ModelException {
        ((CartManager)this.getTheObject()).setOnDelivery(newValue);
    }
    public PreOrderView getPreOrder()throws ModelException{
        return ((CartManager)this.getTheObject()).getPreOrder();
    }
    public void setPreOrder(PreOrderView newValue) throws ModelException {
        ((CartManager)this.getTheObject()).setPreOrder(newValue);
    }
    public CustomerManagerView getCustomerManager()throws ModelException{
        return ((CartManager)this.getTheObject()).getCustomerManager();
    }
    public CartServiceView getMyCartServer()throws ModelException{
        return ((CartManager)this.getTheObject()).getMyCartServer();
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
