package view;

import view.objects.*;

import view.visitor.*;

public interface QuantifiedArticlesView extends Anything, AbstractViewRoot {
    
    public ArticleView getArticle()throws ModelException;
    public void setArticle(ArticleView newValue) throws ModelException ;
    public CustomerOrderView getMyOrder()throws ModelException;
    public void setMyOrder(CustomerOrderView newValue) throws ModelException ;
    public long getAmount()throws ModelException;
    public void setAmount(long newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

