package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class CartProxi extends ViewProxi implements CartView{
    
    public CartProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public CartView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long currentSum = new Long((String)resultTable.get("currentSum")).longValue();
        java.util.Vector<String> articleList_string = (java.util.Vector<String>)resultTable.get("articleList");
        java.util.Vector<QuantifiedArticlesView> articleList = ViewProxi.getProxiVector(articleList_string, connectionKey);
        CartView result$$ = new Cart((long)currentSum,articleList, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getArticleList().size()) return new ArticleListCartWrapper(this, originalIndex, (ViewRoot)this.getArticleList().get(index));
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
    
    public long getCurrentSum()throws ModelException{
        return ((Cart)this.getTheObject()).getCurrentSum();
    }
    public void setCurrentSum(long newValue) throws ModelException {
        ((Cart)this.getTheObject()).setCurrentSum(newValue);
    }
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException{
        return ((Cart)this.getTheObject()).getArticleList();
    }
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException {
        ((Cart)this.getTheObject()).setArticleList(newValue);
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
