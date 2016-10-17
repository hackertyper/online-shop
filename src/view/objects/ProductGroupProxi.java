package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ProductGroupProxi extends ItemProxi implements ProductGroupView{
    
    public ProductGroupProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ProductGroupView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        String description = (String)resultTable.get("description");
        java.util.Vector<String> itemList_string = (java.util.Vector<String>)resultTable.get("itemList");
        java.util.Vector<ItemView> itemList = ViewProxi.getProxiVector(itemList_string, connectionKey);
        ProductGroupView result$$ = new ProductGroup((String)description,itemList, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getItemList().size()) return new ItemListProductGroupWrapper(this, originalIndex, (ViewRoot)this.getItemList().get(index));
        index = index - this.getItemList().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getItemList().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getItemList().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getItemListIterator = this.getItemList().iterator();
        while(getItemListIterator.hasNext()){
            if(getItemListIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ItemView> getItemList()throws ModelException{
        return ((ProductGroup)this.getTheObject()).getItemList();
    }
    public void setItemList(java.util.Vector<ItemView> newValue) throws ModelException {
        ((ProductGroup)this.getTheObject()).setItemList(newValue);
    }
    
    public void accept(ItemVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleProductGroup(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleProductGroup(this);
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
