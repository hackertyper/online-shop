package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class RetoureProxi extends DeliveryProxi implements RetoureView{
    
    public RetoureProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public RetoureView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long remainingTimeToDelivery = new Long((String)resultTable.get("remainingTimeToDelivery")).longValue();
        java.util.Date sendDate = (java.util.Date)resultTable.get("sendDate");
        java.util.Vector<String> articleList_string = (java.util.Vector<String>)resultTable.get("articleList");
        java.util.Vector<QuantifiedArticlesView> articleList = ViewProxi.getProxiVector(articleList_string, connectionKey);
        RetoureView result$$ = new Retoure((long)remainingTimeToDelivery,(java.util.Date)sendDate,articleList, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListRetoureWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
        index = index - this.getArticleList().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticleList().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticleList().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getArticleListIterator = this.getArticleList().iterator();
        while(getArticleListIterator.hasNext()){
            if(getArticleListIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return ((Retoure)this.getTheObject()).getArticleList();
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        ((Retoure)this.getTheObject()).setArticleList(newValue);
    }
    
    public void accept(DeliveryVisitor visitor) throws ModelException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleRetoure(this);
    }
    public <E extends view.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends view.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleRetoure(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleRetoure(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleRetoure(this);
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
