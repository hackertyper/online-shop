package view;

import view.objects.*;

import view.visitor.*;

public interface PreOrderView extends Anything, AbstractViewRoot {
    
    public CartManagerView getCartManager()throws ModelException;
    public void setCartManager(CartManagerView newValue) throws ModelException ;
    public long getSum()throws ModelException;
    public void setSum(long newValue) throws ModelException ;
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException;
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException ;
    public StandardDeliveryView getStandardDelivery()throws ModelException;
    public void setStandardDelivery(StandardDeliveryView newValue) throws ModelException ;
    public OverNightDeliveryView getOnDelivery()throws ModelException;
    public void setOnDelivery(OverNightDeliveryView newValue) throws ModelException ;
    
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

