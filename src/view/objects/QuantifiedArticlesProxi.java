package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class QuantifiedArticlesProxi extends ViewProxi implements QuantifiedArticlesView{
    
    public QuantifiedArticlesProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public QuantifiedArticlesView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        ViewProxi article = null;
        String article$String = (String)resultTable.get("article");
        if (article$String != null) {
            common.ProxiInformation article$Info = common.RPCConstantsAndServices.createProxiInformation(article$String);
            article = view.objects.ViewProxi.createProxi(article$Info,connectionKey);
            article.setToString(article$Info.getToString());
        }
        long amount = new Long((String)resultTable.get("amount")).longValue();
        QuantifiedArticlesView result$$ = new QuantifiedArticles((ArticleView)article,(long)amount, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index == 0 && this.getArticle() != null) return new ArticleQuantifiedArticlesWrapper(this, originalIndex, (ViewRoot)this.getArticle());
        if(this.getArticle() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getArticle() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getArticle() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getArticle() != null && this.getArticle().equals(child)) return result;
        if(this.getArticle() != null) result = result + 1;
        return -1;
    }
    
    public ArticleView getArticle()throws ModelException{
        return ((QuantifiedArticles)this.getTheObject()).getArticle();
    }
    public void setArticle(ArticleView newValue) throws ModelException {
        ((QuantifiedArticles)this.getTheObject()).setArticle(newValue);
    }
    public long getAmount()throws ModelException{
        return ((QuantifiedArticles)this.getTheObject()).getAmount();
    }
    public void setAmount(long newValue) throws ModelException {
        ((QuantifiedArticles)this.getTheObject()).setAmount(newValue);
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleQuantifiedArticles(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleQuantifiedArticles(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleQuantifiedArticles(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleQuantifiedArticles(this);
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
