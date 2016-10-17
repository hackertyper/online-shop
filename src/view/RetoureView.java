package view;

import view.visitor.*;

public interface RetoureView extends DeliveryView {
    
    public java.util.Vector<QuantifiedArticlesView> getArticleList()throws ModelException;
    public void setArticleList(java.util.Vector<QuantifiedArticlesView> newValue) throws ModelException ;
    
    public void accept(DeliveryVisitor visitor) throws ModelException;
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

