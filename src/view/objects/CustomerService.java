
package view.objects;

import view.*;
import viewClient.*;
import view.visitor.*;


/* Additional import section end */

public class CustomerService extends view.objects.Service implements CustomerServiceView{
    
    protected java.util.Vector<CustomerServiceView> services;
    protected CustomerManagerView manager;
    
    public CustomerService(java.util.Vector<ErrorDisplayView> errors,java.util.Vector<CustomerServiceView> services,CustomerManagerView manager,long id, long classId) {
        /* Shall not be used. Objects are created on the server only */
        super(errors,id, classId);
        this.services = services;
        this.manager = manager;        
    }
    
    static public long getTypeId() {
        return -103;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public java.util.Vector<CustomerServiceView> getServices()throws ModelException{
        return this.services;
    }
    public void setServices(java.util.Vector<CustomerServiceView> newValue) throws ModelException {
        this.services = newValue;
    }
    public CustomerManagerView getManager()throws ModelException{
        return this.manager;
    }
    public void setManager(CustomerManagerView newValue) throws ModelException {
        this.manager = newValue;
    }
    
    public void accept(CustomerServiceVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(ServiceVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(AnythingVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(RemoteVisitor visitor) throws ModelException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws ModelException {
         return visitor.handleCustomerService(this);
    }
    public <E extends view.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws ModelException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends view.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws ModelException, E {
         return visitor.handleCustomerService(this);
    }
    
    public void resolveProxies(java.util.HashMap<String,Object> resultTable) throws ModelException {
        java.util.Vector<?> errors = this.getErrors();
        if (errors != null) {
            ViewObject.resolveVectorProxies(errors, resultTable);
        }
        java.util.Vector<?> services = this.getServices();
        if (services != null) {
            ViewObject.resolveVectorProxies(services, resultTable);
        }
        CustomerManagerView manager = this.getManager();
        if (manager != null) {
            ((ViewProxi)manager).setObject((ViewObject)resultTable.get(common.RPCConstantsAndServices.createHashtableKey(manager.getClassId(), manager.getId())));
        }
        
    }
    public void sortSetValuedFields() throws ModelException {
        
    }
    public ViewObjectInTree getChild(int originalIndex) throws ModelException{
        int index = originalIndex;
        if(index < this.getServices().size()) return new ServicesCustomerServiceWrapper(this, originalIndex, (ViewRoot)this.getServices().get(index));
        index = index - this.getServices().size();
        if(this.getManager() != null && index < this.getManager().getTheObject().getChildCount())
            return this.getManager().getTheObject().getChild(index);
        if(this.getManager() != null) index = index - this.getManager().getTheObject().getChildCount();
        return null;
    }
    public int getChildCount() throws ModelException {
        return 0 
            + (this.getServices().size())
            + (this.getManager() == null ? 0 : this.getManager().getTheObject().getChildCount());
    }
    public boolean isLeaf() throws ModelException {
        return true 
            && (this.getServices().size() == 0)
            && (this.getManager() == null ? true : this.getManager().getTheObject().isLeaf());
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
    public CustomerServiceConnection connectCustomerService(ConnectionMaster master, final ExceptionAndEventHandler handler) throws ModelException{
        CustomerServiceConnection result;
		try {
			result = (CustomerServiceConnection) new CustomerServiceConnection(master.getUrlString(), master.getHandler(), master.getReporter()).fork(master, this);
		} catch (java.net.MalformedURLException e) {
			throw new ModelException(e.getMessage(),0);
		}
		result.setHandler(handler);
		ConnectionIndex.getTheConnectionIndex().setConnection(handler,result);
		handler.setConnection(result);
		handler.initializeConnection();
		return result;
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
