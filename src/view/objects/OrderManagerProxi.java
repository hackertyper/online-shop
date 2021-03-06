package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderManagerProxi extends ViewProxi implements OrderManagerView{
    
    public OrderManagerProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public OrderManagerView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> orders_string = (java.util.Vector<String>)resultTable.get("orders");
        java.util.Vector<CustomerOrderView> orders = ViewProxi.getProxiVector(orders_string, connectionKey);
        java.util.Vector<String> preOrders_string = (java.util.Vector<String>)resultTable.get("preOrders");
        java.util.Vector<PreOrderView> preOrders = ViewProxi.getProxiVector(preOrders_string, connectionKey);
        long retourePrice = new Long((String)resultTable.get("retourePrice")).longValue();
        ViewProxi customerManager = null;
        String customerManager$String = (String)resultTable.get("customerManager");
        if (customerManager$String != null) {
            common.ProxiInformation customerManager$Info = common.RPCConstantsAndServices.createProxiInformation(customerManager$String);
            customerManager = view.objects.ViewProxi.createProxi(customerManager$Info,connectionKey);
            customerManager.setToString(customerManager$Info.getToString());
        }
        ViewProxi myOrderServer = null;
        String myOrderServer$String = (String)resultTable.get("myOrderServer");
        if (myOrderServer$String != null) {
            common.ProxiInformation myOrderServer$Info = common.RPCConstantsAndServices.createProxiInformation(myOrderServer$String);
            myOrderServer = view.objects.ViewProxi.createProxi(myOrderServer$Info,connectionKey);
            myOrderServer.setToString(myOrderServer$Info.getToString());
        }
        OrderManagerView result$$ = new OrderManager(orders,preOrders,(long)retourePrice,(CustomerManagerView)customerManager,(OrderServiceView)myOrderServer, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
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
        if (this.object == null) return this.getLeafInfo() == 0;
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
    
    public java.util.Vector<CustomerOrderView> getOrders()throws ModelException{
        return ((OrderManager)this.getTheObject()).getOrders();
    }
    public void setOrders(java.util.Vector<CustomerOrderView> newValue) throws ModelException {
        ((OrderManager)this.getTheObject()).setOrders(newValue);
    }
    public java.util.Vector<PreOrderView> getPreOrders()throws ModelException{
        return ((OrderManager)this.getTheObject()).getPreOrders();
    }
    public void setPreOrders(java.util.Vector<PreOrderView> newValue) throws ModelException {
        ((OrderManager)this.getTheObject()).setPreOrders(newValue);
    }
    public long getRetourePrice()throws ModelException{
        return ((OrderManager)this.getTheObject()).getRetourePrice();
    }
    public void setRetourePrice(long newValue) throws ModelException {
        ((OrderManager)this.getTheObject()).setRetourePrice(newValue);
    }
    public CustomerManagerView getCustomerManager()throws ModelException{
        return ((OrderManager)this.getTheObject()).getCustomerManager();
    }
    public OrderServiceView getMyOrderServer()throws ModelException{
        return ((OrderManager)this.getTheObject()).getMyOrderServer();
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
