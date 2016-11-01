package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CustomerOrderProxi extends DeliveryProxi implements CustomerOrderView{
    
    public CustomerOrderProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public CustomerOrderView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long remainingTimeToDelivery = new Long((String)resultTable.get("remainingTimeToDelivery")).longValue();
        java.util.Date sendDate = (java.util.Date)resultTable.get("sendDate");
        java.util.Vector<String> articleList_string = (java.util.Vector<String>)resultTable.get("articleList");
        java.util.Vector<QuantifiedArticlesView> articleList = ViewProxi.getProxiVector(articleList_string, connectionKey);
        ViewProxi ordermngr = null;
        String ordermngr$String = (String)resultTable.get("ordermngr");
        if (ordermngr$String != null) {
            common.ProxiInformation ordermngr$Info = common.RPCConstantsAndServices.createProxiInformation(ordermngr$String);
            ordermngr = view.objects.ViewProxi.createProxi(ordermngr$Info,connectionKey);
            ordermngr.setToString(ordermngr$Info.getToString());
        }
        ViewProxi myState = null;
        String myState$String = (String)resultTable.get("myState");
        if (myState$String != null) {
            common.ProxiInformation myState$Info = common.RPCConstantsAndServices.createProxiInformation(myState$String);
            myState = view.objects.ViewProxi.createProxi(myState$Info,connectionKey);
            myState.setToString(myState$Info.getToString());
        }
        CustomerOrderView result$$ = new CustomerOrder((long)remainingTimeToDelivery,(java.util.Date)sendDate,articleList,(OrderManagerView)ordermngr,(CustomerOrderState)myState, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListCustomerOrderWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        if(this.getOrdermngr() != null && index < this.getOrdermngr().getTheObject().getChildCount())
            return this.getOrdermngr().getTheObject().getChild(index);
        if(this.getOrdermngr() != null) index = index - this.getOrdermngr().getTheObject().getChildCount();
        if(this.getMyState() != null && index < this.getMyState().getTheObject().getChildCount())
            return this.getMyState().getTheObject().getChild(index);
        if(this.getMyState() != null) index = index - this.getMyState().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleList().size())
            + (this.getOrdermngr() == null ? 0 : this.getOrdermngr().getTheObject().getChildCount())
            + (this.getMyState() == null ? 0 : this.getMyState().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticleList().size() == 0)
            && (this.getOrdermngr() == null ? true : this.getOrdermngr().getTheObject().isLeaf())
            && (this.getMyState() == null ? true : this.getMyState().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticleListIterator = this.getArticleList().iterator();
        while(getArticleListIterator.hasNext()){
            if(getArticleListIterator.next().equals(child)) return result;
            result = result + 1;
        }
        if(this.getOrdermngr() != null && this.getOrdermngr().equals(child)) return result;
        if(this.getOrdermngr() != null) result = result + 1;
        if(this.getMyState() != null && this.getMyState().equals(child)) return result;
        if(this.getMyState() != null) result = result + 1;
        return -1;
    }
    
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return ((CustomerOrder)this.getTheObject()).getArticleList();
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        ((CustomerOrder)this.getTheObject()).setArticleList(newValue);
    }
    public OrderManagerView getOrdermngr()throws ModelException{
        return ((CustomerOrder)this.getTheObject()).getOrdermngr();
    }
    public void setOrdermngr(OrderManagerView newValue) throws ModelException {
        ((CustomerOrder)this.getTheObject()).setOrdermngr(newValue);
    }
    public CustomerOrderState getMyState()throws ModelException{
        return ((CustomerOrder)this.getTheObject()).getMyState();
    }
    public void setMyState(CustomerOrderState newValue) throws ModelException {
        ((CustomerOrder)this.getTheObject()).setMyState(newValue);
    }
    
    public void accept(DeliveryVisitor visitor) throws ModelException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends view.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends view.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerOrder(this);
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
