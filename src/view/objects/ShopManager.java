
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class ShopManager extends ViewObject implements ShopManagerView{
    
    protected ProductGroupView basicProductGroup;
    protected CustomerManagerView customerManager;
    protected ShopServiceView myShopServer;
    
    public ShopManager(ProductGroupView basicProductGroup,CustomerManagerView customerManager,ShopServiceView myShopServer,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.basicProductGroup = basicProductGroup;
        this.customerManager = customerManager;
        this.myShopServer = myShopServer;        
    }
    
    static public long getTypeId() {
        return 186;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public ProductGroupView getBasicProductGroup()throws ModelException{
        return this.basicProductGroup;
    }
    public void setBasicProductGroup(ProductGroupView newValue) throws ModelException {
        this.basicProductGroup = newValue;
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
        ProductGroupView basicProductGroup = this.getBasicProductGroup();
        if (basicProductGroup != null) {
            ((ViewProxi)basicProductGroup).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(basicProductGroup.getClassId(), basicProductGroup.getId())));
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
        if(index == 0 && this.getBasicProductGroup() != null) return new BasicProductGroupShopManagerWrapper(this, originalIndex, (ViewRoot)this.getBasicProductGroup());
        if(this.getBasicProductGroup() != null) index = index - 1;
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getBasicProductGroup() == null ? 0 : 1);
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getBasicProductGroup() == null ? true : false);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getBasicProductGroup() != null && this.getBasicProductGroup().equals(child)) return result;
        if(this.getBasicProductGroup() != null) result = result + 1;
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
