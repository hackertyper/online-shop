package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ShopManagerProxi extends ViewProxi implements ShopManagerView{
    
    public ShopManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ShopManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> itemRange_string = (java.util.Vector<String>)resultTable.get("itemRange");
        java.util.Vector<ItemView> itemRange = ViewProxi.getProxiVector(itemRange_string, connectionKey);
        ViewProxi customerManager = null;
        String customerManager$String = (String)resultTable.get("customerManager");
        if (customerManager$String != null) {
            common.ProxiInformation customerManager$Info = common.RPCConstantsAndServices.createProxiInformation(customerManager$String);
            customerManager = view.objects.ViewProxi.createProxi(customerManager$Info,connectionKey);
            customerManager.setToString(customerManager$Info.getToString());
        }
        ViewProxi myShopServer = null;
        String myShopServer$String = (String)resultTable.get("myShopServer");
        if (myShopServer$String != null) {
            common.ProxiInformation myShopServer$Info = common.RPCConstantsAndServices.createProxiInformation(myShopServer$String);
            myShopServer = view.objects.ViewProxi.createProxi(myShopServer$Info,connectionKey);
            myShopServer.setToString(myShopServer$Info.getToString());
        }
        ShopManagerView result$$ = new ShopManager(itemRange,(CustomerManagerView)customerManager,(ShopServiceView)myShopServer, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getItemRange().size()) return new ItemRangeShopManagerWrapper(this, originalIndex, (ViewRoot)this.getItemRange().get(index));
        index = index - this.getItemRange().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getItemRange().size());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getItemRange().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getItemRangeIterator = this.getItemRange().iterator();
        while(getItemRangeIterator.hasNext()){
            if(getItemRangeIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    
    public java.util.Vector<ItemView> getItemRange()throws ModelException{
        return ((ShopManager)this.getTheObject()).getItemRange();
    }
    public void setItemRange(java.util.Vector<ItemView> newValue) throws ModelException {
        ((ShopManager)this.getTheObject()).setItemRange(newValue);
    }
    public CustomerManagerView getCustomerManager()throws ModelException{
        return ((ShopManager)this.getTheObject()).getCustomerManager();
    }
    public ShopServiceView getMyShopServer()throws ModelException{
        return ((ShopManager)this.getTheObject()).getMyShopServer();
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleShopManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopManager(this);
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
