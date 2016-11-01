package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class OrderServiceProxi extends CustomerServiceProxi implements OrderServiceView{
    
    public OrderServiceProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public OrderServiceView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> errors_string = (java.util.Vector<String>)resultTable.get("errors");
        java.util.Vector<ErrorDisplayView> errors = ViewProxi.getProxiVector(errors_string, connectionKey);
        java.util.Vector<String> services_string = (java.util.Vector<String>)resultTable.get("services");
        java.util.Vector<CustomerServiceView> services = ViewProxi.getProxiVector(services_string, connectionKey);
        ViewProxi manager = null;
        String manager$String = (String)resultTable.get("manager");
        if (manager$String != null) {
            common.ProxiInformation manager$Info = common.RPCConstantsAndServices.createProxiInformation(manager$String);
            manager = view.objects.ViewProxi.createProxi(manager$Info,connectionKey);
            manager.setToString(manager$Info.getToString());
        }
        ViewProxi orderMngr = null;
        String orderMngr$String = (String)resultTable.get("orderMngr");
        if (orderMngr$String != null) {
            common.ProxiInformation orderMngr$Info = common.RPCConstantsAndServices.createProxiInformation(orderMngr$String);
            orderMngr = view.objects.ViewProxi.createProxi(orderMngr$Info,connectionKey);
            orderMngr.setToString(orderMngr$Info.getToString());
        }
        OrderServiceView result$$ = new OrderService(errors,services,(CustomerManagerView)manager,(OrderManagerView)orderMngr, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getServices().size()) return new ServicesCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getServices().get(index));
        index = index - this.getServices().size();
        if(this.getManager() != null && index < this.getManager().getTheObject().getChildCount())
            return this.getManager().getTheObject().getChild(index);
        if(this.getManager() != null) index = index - this.getManager().getTheObject().getChildCount();
        if(this.getOrderMngr() != null && index < this.getOrderMngr().getTheObject().getChildCount())
            return this.getOrderMngr().getTheObject().getChild(index);
        if(this.getOrderMngr() != null) index = index - this.getOrderMngr().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getServices().size())
            + (this.getManager() == null ? 0 : this.getManager().getTheObject().getChildCount())
            + (this.getOrderMngr() == null ? 0 : this.getOrderMngr().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getServices().size() == 0)
            && (this.getManager() == null ? true : this.getManager().getTheObject().isLeaf())
            && (this.getOrderMngr() == null ? true : this.getOrderMngr().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        java.util.Iterator<?> getServicesIterator = this.getServices().iterator();
        while(getServicesIterator.hasNext()){
            if(getServicesIterator.next().equals(child)) return result;
            result = result + 1;
        }
        if(this.getManager() != null && this.getManager().equals(child)) return result;
        if(this.getManager() != null) result = result + 1;
        if(this.getOrderMngr() != null && this.getOrderMngr().equals(child)) return result;
        if(this.getOrderMngr() != null) result = result + 1;
        return -1;
    }
    
    public OrderManagerView getOrderMngr()throws ModelException{
        return ((OrderService)this.getTheObject()).getOrderMngr();
    }
    public void setOrderMngr(OrderManagerView newValue) throws ModelException {
        ((OrderService)this.getTheObject()).setOrderMngr(newValue);
    }
    
    public void accept(CustomerServiceVisitor visitor) throws ModelException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderService(this);
    }
    public <E extends view.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends view.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleOrderService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleOrderService(this);
    }
    
    
    public OrderServiceConnection connectOrderService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        OrderServiceConnection result;
		try {
			result = (OrderServiceConnection) new OrderServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
		} catch (java.net.MalformedURLException e) {
			throw new ModelException(e.getMessage(),0);
		}
		result.setHandler(handler);
		ConnectionIndex.getTheConnectionIndex().setConnection(handler,result);
		handler.setConnection(result);
		handler.initializeConnection();
		return result;
    }public boolean hasTransientFields(){
        return false;
    }
    
    public javafx.scene.image.Image getImage(){
        return super.getImage();
    }

	/* Start of protected part that is not overridden by persistence generator */
    
    private final int RemoteDepth = 1;
    
    /* End of protected part that is not overridden by persistence generator */
    
}
