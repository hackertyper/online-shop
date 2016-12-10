
package view.objects;

import view.*;
import view.visitor.*;


/* Additional import section end */

public class OrderManager extends ViewObject implements OrderManagerView{
    
    protected java.util.Vector<CustomerOrderView> orders;
    protected java.util.Vector<PreOrderView> preOrders;
    protected long retourePrice;
    protected CustomerManagerView customerManager;
    protected OrderServiceView myOrderServer;
    
    public OrderManager(java.util.Vector<CustomerOrderView> orders,java.util.Vector<PreOrderView> preOrders,long retourePrice,CustomerManagerView customerManager,OrderServiceView myOrderServer,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(id, classId);
        this.orders = orders;
        this.preOrders = preOrders;
        this.retourePrice = retourePrice;
        this.customerManager = customerManager;
        this.myOrderServer = myOrderServer;        
    }
    
    static public long getTypeId() {
        return 187;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<CustomerOrderView> getOrders()throws ModelException{
        return this.orders;
    }
    public void setOrders(java.util.Vector<CustomerOrderView> newValue) throws ModelException {
        this.orders = newValue;
    }
    public java.util.Vector<PreOrderView> getPreOrders()throws ModelException{
        return this.preOrders;
    }
    public void setPreOrders(java.util.Vector<PreOrderView> newValue) throws ModelException {
        this.preOrders = newValue;
    }
    public long getRetourePrice()throws ModelException{
        return this.retourePrice;
    }
    public void setRetourePrice(long newValue) throws ModelException {
        this.retourePrice = newValue;
    }
    public CustomerManagerView getCustomerManager()throws ModelException{
        return this.customerManager;
    }
    public OrderServiceView getMyOrderServer()throws ModelException{
        return this.myOrderServer;
    }
    
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderManager(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderManager(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderManager(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> orders = this.getOrders();
        if (orders != null) {
            ViewObject.resolveVectorProxies(orders, resultTable);
        }
        java.util.Vector<?> preOrders = this.getPreOrders();
        if (preOrders != null) {
            ViewObject.resolveVectorProxies(preOrders, resultTable);
        }
        CustomerManagerView customerManager = this.getCustomerManager();
        if (customerManager != null) {
            ((ViewProxi)customerManager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(customerManager.getClassId(), customerManager.getId())));
        }
        OrderServiceView myOrderServer = this.getMyOrderServer();
        if (myOrderServer != null) {
            ((ViewProxi)myOrderServer).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(myOrderServer.getClassId(), myOrderServer.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getOrders().size()) return new OrdersOrderManagerWrapper(this, originalIndex, (ViewRoot)this.getOrders().get(index));
        index = index - this.getOrders().size();
        if(index < this.getPreOrders().size()) return new PreOrdersOrderManagerWrapper(this, originalIndex, (ViewRoot)this.getPreOrders().get(index));
        index = index - this.getPreOrders().size();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getOrders().size())
            + (this.getPreOrders().size());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getOrders().size() == 0)
            && (this.getPreOrders().size() == 0);
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getOrdersIterator = this.getOrders().iterator();
        while(getOrdersIterator.hasNext()){
            if(getOrdersIterator.next().equals(child)) return result;
            result = result + 1;
        }
        java.util.Iterator<?> getPreOrdersIterator = this.getPreOrders().iterator();
        while(getPreOrdersIterator.hasNext()){
            if(getPreOrdersIterator.next().equals(child)) return result;
            result = result + 1;
        }
        return -1;
    }
    public int getRetourePriceIndex() throws ModelException {
        return 0 + this.getOrders().size() + this.getPreOrders().size();
    }
    public int getRowCount(){
        return 0 
            + 1;
    }
    public Object getValueAt(int rowIndex, int columnIndex){
        try {
            if(columnIndex == 0){
                if(rowIndex == 0) return "retourePrice";
                rowIndex = rowIndex - 1;
            } else {
                if(rowIndex == 0) return new Long(getRetourePrice());
                rowIndex = rowIndex - 1;
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
        if(rowIndex == 0){
            this.setRetourePrice(Long.parseLong(newValue));
            return;
        }
        rowIndex = rowIndex - 1;
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
