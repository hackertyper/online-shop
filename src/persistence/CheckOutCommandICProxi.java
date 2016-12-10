package persistence;



import model.visitor.*;

public class CheckOutCommandICProxi extends PersistentInCacheProxi implements PersistentCheckOutCommand{
    
    public CheckOutCommandICProxi(long objectId) {
        super(objectId);
    }
    public CheckOutCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCheckOutCommandFacade
            .getCheckOutCommand(this.getId());
    }
    
    public long getClassId() {
        return 213;
    }
    
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentCheckOutCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentCheckOutCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentCartManager getCommandReceiver() throws PersistenceException {
        return ((PersistentCheckOutCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentCheckOutCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentCheckOutCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentCheckOutCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentCheckOutCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCheckOutCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentCheckOutCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentCheckOutCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleCheckOutCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckOutCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckOutCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckOutCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCheckOutCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckOutCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckOutCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckOutCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleCheckOutCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckOutCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckOutCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckOutCommand(this);
    }
    public void accept(CartManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleCheckOutCommand(this);
    }
    public <R> R accept(CartManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckOutCommand(this);
    }
    public <E extends model.UserException>  void accept(CartManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckOutCommand(this);
    }
    public <R, E extends model.UserException> R accept(CartManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckOutCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentCheckOutCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentCheckOutCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentCheckOutCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCheckOutCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentCheckOutCommand)this.getTheObject()).sendResult();
    }

    
}
