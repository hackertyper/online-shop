package view;

import view.visitor.*;

public interface ArticleView extends ItemView {
    
    public ManufacturerView getManufacturer()throws ModelException;
    public void setManufacturer(ManufacturerView newValue) throws ModelException ;
    public ArticleState getState()throws ModelException;
    public void setState(ArticleState newValue) throws ModelException ;
    public ArticleWrapperView getMyWrapper()throws ModelException;
    public void setMyWrapper(ArticleWrapperView newValue) throws ModelException ;
    public long getPrice()throws ModelException;
    public void setPrice(long newValue) throws ModelException ;
    public long getMinStock()throws ModelException;
    public void setMinStock(long newValue) throws ModelException ;
    public long getMaxStock()throws ModelException;
    public void setMaxStock(long newValue) throws ModelException ;
    public long getStock()throws ModelException;
    public void setStock(long newValue) throws ModelException ;
    public long getReserved()throws ModelException;
    public void setReserved(long newValue) throws ModelException ;
    
    public void accept(ItemVisitor visitor) throws ModelException;
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    public void accept(AnythingVisitor visitor) throws ModelException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException;
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E;
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E;
    
}

