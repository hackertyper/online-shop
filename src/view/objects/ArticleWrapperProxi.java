package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ArticleWrapperProxi extends ViewProxi implements ArticleWrapperView{
    
    public ArticleWrapperProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ArticleWrapperView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        long price = new Long((String)resultTable.get("price")).longValue();
        long stock = new Long((String)resultTable.get("stock")).longValue();
        ViewProxi myArticle = null;
        String myArticle$String = (String)resultTable.get("myArticle");
        if (myArticle$String != null) {
            common.ProxiInformation myArticle$Info = common.RPCConstantsAndServices.createProxiInformation(myArticle$String);
            myArticle = view.objects.ViewProxi.createProxi(myArticle$Info,connectionKey);
            myArticle.setToString(myArticle$Info.getToString());
        }
        ArticleWrapperView result$$ = new ArticleWrapper((long)price,(long)stock,(ArticleView)myArticle, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 ;
    }
    public boolean isLeaf() throws ModelException {
        return true;
    }
    public int getIndexOfChild(Object child) throws ModelException {
        
        return -1;
    }
    
    public long getPrice()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getPrice();
    }
    public long getStock()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getStock();
    }
    public ArticleView getMyArticle()throws ModelException{
        return ((ArticleWrapper)this.getTheObject()).getMyArticle();
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticleWrapper(this);
    }
    
    public boolean hasTransientFields(){
        return true;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
