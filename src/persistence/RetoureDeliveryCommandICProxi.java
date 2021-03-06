package persistence;



import model.visitor.*;

public class RetoureDeliveryCommandICProxi extends PersistentInCacheProxi implements PersistentRetoureDeliveryCommand{
    
    public RetoureDeliveryCommandICProxi(long objectId) {
        super(objectId);
    }
    public RetoureDeliveryCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theRetoureDeliveryCommandFacade
            .getRetoureDeliveryCommand(this.getId());
    }
    
    public long getClassId() {
        return 206;
    }
    
    public PersistentCustomerOrder getArrivedOrder() throws PersistenceException {
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).getArrivedOrder();
    }
    public void setArrivedOrder(PersistentCustomerOrder newValue) throws PersistenceException {
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).setArrivedOrder(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentOrderManager getCommandReceiver() throws PersistenceException {
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentOrderManager newValue) throws PersistenceException {
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleRetoureDeliveryCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRetoureDeliveryCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleRetoureDeliveryCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public void accept(OrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleRetoureDeliveryCommand(this);
    }
    public <R> R accept(OrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureDeliveryCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentRetoureDeliveryCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentRetoureDeliveryCommand)this.getTheObject()).sendResult();
    }

    
}
