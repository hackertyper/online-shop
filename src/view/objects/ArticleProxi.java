package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ArticleProxi extends ItemProxi implements ArticleView{
    
    public ArticleProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    public ArticleView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String description = (String)resultTable.get("description");
        ViewProxi manufacturer = null;
        String manufacturer$String = (String)resultTable.get("manufacturer");
        if (manufacturer$String != null) {
            common.ProxiInformation manufacturer$Info = common.RPCConstantsAndServices.createProxiInformation(manufacturer$String);
            manufacturer = view.objects.ViewProxi.createProxi(manufacturer$Info,connectionKey);
            manufacturer.setToString(manufacturer$Info.getToString());
        }
        ViewProxi state = null;
        String state$String = (String)resultTable.get("state");
        if (state$String != null) {
            common.ProxiInformation state$Info = common.RPCConstantsAndServices.createProxiInformation(state$String);
            state = view.objects.ViewProxi.createProxi(state$Info,connectionKey);
            state.setToString(state$Info.getToString());
        }
        ViewProxi myWrapper = null;
        String myWrapper$String = (String)resultTable.get("myWrapper");
        if (myWrapper$String != null) {
            common.ProxiInformation myWrapper$Info = common.RPCConstantsAndServices.createProxiInformation(myWrapper$String);
            myWrapper = view.objects.ViewProxi.createProxi(myWrapper$Info,connectionKey);
            myWrapper.setToString(myWrapper$Info.getToString());
        }
        long price = new Long((String)resultTable.get("price")).longValue();
        long minStock = new Long((String)resultTable.get("minStock")).longValue();
        long maxStock = new Long((String)resultTable.get("maxStock")).longValue();
        long manuDelivery = new Long((String)resultTable.get("manuDelivery")).longValue();
        long stock = new Long((String)resultTable.get("stock")).longValue();
        ArticleView result$$ = new Article((String)description,(ManufacturerView)manufacturer,(ArticleState)state,(ArticleWrapperView)myWrapper,(long)price,(long)minStock,(long)maxStock,(long)manuDelivery,(long)stock, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getManufacturer() != null && index < this.getManufacturer().getTheObject().getChildCount())
            return this.getManufacturer().getTheObject().getChild(index);
        if(this.getManufacturer() != null) index = index - this.getManufacturer().getTheObject().getChildCount();
        if(this.getState() != null && index < this.getState().getTheObject().getChildCount())
            return this.getState().getTheObject().getChild(index);
        if(this.getState() != null) index = index - this.getState().getTheObject().getChildCount();
        if(this.getMyWrapper() != null && index < this.getMyWrapper().getTheObject().getChildCount())
            return this.getMyWrapper().getTheObject().getChild(index);
        if(this.getMyWrapper() != null) index = index - this.getMyWrapper().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getManufacturer() == null ? 0 : this.getManufacturer().getTheObject().getChildCount())
            + (this.getState() == null ? 0 : this.getState().getTheObject().getChildCount())
            + (this.getMyWrapper() == null ? 0 : this.getMyWrapper().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getManufacturer() == null ? true : this.getManufacturer().getTheObject().isLeaf())
            && (this.getState() == null ? true : this.getState().getTheObject().isLeaf())
            && (this.getMyWrapper() == null ? true : this.getMyWrapper().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getManufacturer() != null && this.getManufacturer().equals(child)) return result;
        if(this.getManufacturer() != null) result = result + 1;
        if(this.getState() != null && this.getState().equals(child)) return result;
        if(this.getState() != null) result = result + 1;
        if(this.getMyWrapper() != null && this.getMyWrapper().equals(child)) return result;
        if(this.getMyWrapper() != null) result = result + 1;
        return -1;
    }
    
    public ManufacturerView getManufacturer()throws ModelException{
        return ((Article)this.getTheObject()).getManufacturer();
    }
    public void setManufacturer(ManufacturerView newValue) throws ModelException {
        ((Article)this.getTheObject()).setManufacturer(newValue);
    }
    public ArticleState getState()throws ModelException{
        return ((Article)this.getTheObject()).getState();
    }
    public void setState(ArticleState newValue) throws ModelException {
        ((Article)this.getTheObject()).setState(newValue);
    }
    public ArticleWrapperView getMyWrapper()throws ModelException{
        return ((Article)this.getTheObject()).getMyWrapper();
    }
    public void setMyWrapper(ArticleWrapperView newValue) throws ModelException {
        ((Article)this.getTheObject()).setMyWrapper(newValue);
    }
    public long getPrice()throws ModelException{
        return ((Article)this.getTheObject()).getPrice();
    }
    public void setPrice(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setPrice(newValue);
    }
    public long getMinStock()throws ModelException{
        return ((Article)this.getTheObject()).getMinStock();
    }
    public void setMinStock(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setMinStock(newValue);
    }
    public long getMaxStock()throws ModelException{
        return ((Article)this.getTheObject()).getMaxStock();
    }
    public void setMaxStock(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setMaxStock(newValue);
    }
    public long getManuDelivery()throws ModelException{
        return ((Article)this.getTheObject()).getManuDelivery();
    }
    public void setManuDelivery(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setManuDelivery(newValue);
    }
    public long getStock()throws ModelException{
        return ((Article)this.getTheObject()).getStock();
    }
    public void setStock(long newValue) throws ModelException {
        ((Article)this.getTheObject()).setStock(newValue);
    }
    
    public void accept(ItemVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleArticle(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleArticle(this);
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
