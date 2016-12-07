package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class PreOrderProxi extends ViewProxi implements PreOrderView{
    
    public PreOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public PreOrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi cartManager = null;
        String cartManager$String = (String)resultTable.get("cartManager");
        if (cartManager$String != null) {
            common.ProxiInformation cartManager$Info = common.RPCConstantsAndServices.createProxiInformation(cartManager$String);
            cartManager = view.objects.ViewProxi.createProxi(cartManager$Info,connectionKey);
            cartManager.setToString(cartManager$Info.getToString());
        }
        long sum = new Long((String)resultTable.get("sum")).longValue();
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
        PreOrderView result$$ = new PreOrder((CartManagerView)cartManager,(long)sum,articleList,(StandardDeliveryView)standardDelivery,(OverNightDeliveryView)onDelivery, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListPreOrderWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        if(index == 0 && this.getStandardDelivery() != null) return new StandardDeliveryPreOrderWrapper(this, originalIndex, (ViewRoot)this.getStandardDelivery());
        if(this.getStandardDelivery() != null) index = index - 1;
        if(index == 0 && this.getOnDelivery() != null) return new OnDeliveryPreOrderWrapper(this, originalIndex, (ViewRoot)this.getOnDelivery());
        if(this.getOnDelivery() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleList().size())
            + (this.getStandardDelivery() == null ? 0 : 1)
            + (this.getOnDelivery() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticleList().size() == 0)
            && (this.getStandardDelivery() == null ? true : false)
            && (this.getOnDelivery() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
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
    
    public CartManagerView getCartManager()throws ModelException{
        return ((PreOrder)this.getTheObject()).getCartManager();
    }
    public void setCartManager(CartManagerView newValue) throws ModelException {
        ((PreOrder)this.getTheObject()).setCartManager(newValue);
    }
    public long getSum()throws ModelException{
        return ((PreOrder)this.getTheObject()).getSum();
    }
    public void setSum(long newValue) throws ModelException {
        ((PreOrder)this.getTheObject()).setSum(newValue);
    }
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return ((PreOrder)this.getTheObject()).getArticleList();
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        ((PreOrder)this.getTheObject()).setArticleList(newValue);
    }
    public StandardDeliveryView getStandardDelivery()throws ModelException{
        return ((PreOrder)this.getTheObject()).getStandardDelivery();
    }
    public void setStandardDelivery(StandardDeliveryView newValue) throws ModelException {
        ((PreOrder)this.getTheObject()).setStandardDelivery(newValue);
    }
    public OverNightDeliveryView getOnDelivery()throws ModelException{
        return ((PreOrder)this.getTheObject()).getOnDelivery();
    }
    public void setOnDelivery(OverNightDeliveryView newValue) throws ModelException {
        ((PreOrder)this.getTheObject()).setOnDelivery(newValue);
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
