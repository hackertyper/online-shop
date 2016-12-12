
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ShopManager extends ViewObject implements ShopManagerView{
    
    protected java.util.Vector<ItemView> itemRange;
    protected CustomerManagerView customerManager;
    protected ShopServiceView myShopServer;
    
    public ShopManager(java.util.Vector<ItemView> itemRange,CustomerManagerView customerManager,ShopServiceView myShopServer,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.itemRange = itemRange;
        this.customerManager = customerManager;
        this.myShopServer = myShopServer;        
    }
    
    static public long getTypeId() {
        return 168;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<ItemView> getItemRange()throws ModelException{
        return this.itemRange;
    }
    public void setItemRange(java.util.Vector<ItemView> newValue) throws ModelException {
        this.itemRange = newValue;
    }
    public CustomerManagerView getCustomerManager()throws ModelException{
        return this.customerManager;
    }
    public ShopServiceView getMyShopServer()throws ModelException{
        return this.myShopServer;
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
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> itemRange = this.getItemRange();
        if (itemRange != null) {
            ViewObject.resolveVectorProxies(itemRange, resultTable);
        }
        CustomerManagerView customerManager = this.getCustomerManager();
        if (customerManager != null) {
            ((ViewProxi)customerManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerManager.getClassId(), customerManager.getId())));
        }
        ShopServiceView myShopServer = this.getMyShopServer();
        if (myShopServer != null) {
            ((ViewProxi)myShopServer).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myShopServer.getClassId(), myShopServer.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
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
    public int getRowCount(){
        return 0 ;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
            } else {
            }
            throw new ModelException("Table index out of bounds!", -1);
        } catch (ModelException e){
            return e.getMessage();
        }
    }
    
    public boolean isRowEditable(int index){
        return true;
    }
    public void setValueAt(String newValue, int rowIndex) throws Exception {
        
    }
    public boolean hasTransientFields(){
        return false;
    }
    /* Start of protected part that is not overridden by persistence generator */
    
    public javafx.scene.image.Image getImage() {
        return super.getImage();
    }
    /* End of protected part that is not overridden by persistence generator */
    
    
}
