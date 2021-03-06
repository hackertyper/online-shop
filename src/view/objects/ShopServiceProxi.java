package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ShopServiceProxi extends CustomerServiceProxi implements ShopServiceView{
    
    public ShopServiceProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ShopServiceView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
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
        ViewProxi shopMngr = null;
        String shopMngr$String = (String)resultTable.get("shopMngr");
        if (shopMngr$String != null) {
            common.ProxiInformation shopMngr$Info = common.RPCConstantsAndServices.createProxiInformation(shopMngr$String);
            shopMngr = view.objects.ViewProxi.createProxi(shopMngr$Info,connectionKey);
            shopMngr.setToString(shopMngr$Info.getToString());
        }
        ShopServiceView result$$ = new ShopService(errors,services,(CustomerManagerView)manager,(ShopManagerView)shopMngr, this.getId(), this.getClassId());
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
        if(this.getShopMngr() != null && index < this.getShopMngr().getTheObject().getChildCount())
            return this.getShopMngr().getTheObject().getChild(index);
        if(this.getShopMngr() != null) index = index - this.getShopMngr().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getServices().size())
            + (this.getManager() == null ? 0 : this.getManager().getTheObject().getChildCount())
            + (this.getShopMngr() == null ? 0 : this.getShopMngr().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getServices().size() == 0)
            && (this.getManager() == null ? true : this.getManager().getTheObject().isLeaf())
            && (this.getShopMngr() == null ? true : this.getShopMngr().getTheObject().isLeaf());
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
        if(this.getShopMngr() != null && this.getShopMngr().equals(child)) return result;
        if(this.getShopMngr() != null) result = result + 1;
        return -1;
    }
    
    public ShopManagerView getShopMngr()throws ModelException{
        return ((ShopService)this.getTheObject()).getShopMngr();
    }
    public void setShopMngr(ShopManagerView newValue) throws ModelException {
        ((ShopService)this.getTheObject()).setShopMngr(newValue);
    }
    
    public void accept(CustomerServiceVisitor visitor) throws ModelException {
        visitor.handleShopService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopService(this);
    }
    public <E extends view.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends view.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopService(this);
    }
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleShopService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleShopService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleShopService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopService(this);
    }
    
    
    public ShopServiceConnection connectShopService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        ShopServiceConnection result;
		try {
			result = (ShopServiceConnection) new ShopServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
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
