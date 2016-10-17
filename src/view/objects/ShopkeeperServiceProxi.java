package view.objects;

import view.*;
import viewClient.*;

import view.visitor.*;

public class ShopkeeperServiceProxi extends ServiceProxi implements ShopkeeperServiceView{
    
    public ShopkeeperServiceProxi(long objectId, long classId, ExceptionAndEventHandler connectionKey) {
        super(objectId, classId, connectionKey);
    }
    
    @SuppressWarnings("unchecked")
    public ShopkeeperServiceView getRemoteObject(java.util.HashMap<String,Object> resultTable, ExceptionAndEventHandler connectionKey) throws ModelException{
        java.util.Vector<String> errors_string = (java.util.Vector<String>)resultTable.get("errors");
        java.util.Vector<ErrorDisplayView> errors = ViewProxi.getProxiVector(errors_string, connectionKey);
        ViewProxi manager = null;
        String manager$String = (String)resultTable.get("manager");
        if (manager$String != null) {
            common.ProxiInformation manager$Info = common.RPCConstantsAndServices.createProxiInformation(manager$String);
            manager = view.objects.ViewProxi.createProxi(manager$Info,connectionKey);
            manager.setToString(manager$Info.getToString());
        }
        ShopkeeperServiceView result$$ = new ShopkeeperService(errors,(ShopkeeperView)manager, this.getId(), this.getClassId());
        ((ViewRoot)result$$).setToString((String) resultTable.get(common.RPCConstantsAndServices.RPCToStringFieldName));
        return result$$;
    }
    
    public int getRemoteDepth() {
        return RemoteDepth;
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(this.getManager() != null && index < this.getManager().getTheObject().getChildCount())
            return this.getManager().getTheObject().getChild(index);
        if(this.getManager() != null) index = index - this.getManager().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getManager() == null ? 0 : this.getManager().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        if (this.object == null) return this.getLeafInfo() == 0;
        return true 
            && (this.getManager() == null ? true : this.getManager().getTheObject().isLeaf());
    }
    public int getIndexOfChild(Object child) throws ModelException {
        int result = 0;
        if(this.getManager() != null && this.getManager().equals(child)) return result;
        if(this.getManager() != null) result = result + 1;
        return -1;
    }
    
    public ShopkeeperView getManager()throws ModelException{
        return ((ShopkeeperService)this.getTheObject()).getManager();
    }
    public void setManager(ShopkeeperView newValue) throws ModelException {
        ((ShopkeeperService)this.getTheObject()).setManager(newValue);
    }
    
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleShopkeeperService(this);
    }
    
    
    public ShopkeeperServiceConnection connectShopkeeperService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        ShopkeeperServiceConnection result;
		try {
			result = (ShopkeeperServiceConnection) new ShopkeeperServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
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
