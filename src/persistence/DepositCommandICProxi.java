package persistence;



import model.visitor.*;

public class DepositCommandICProxi extends PersistentInCacheProxi implements PersistentDepositCommand{
    
    public DepositCommandICProxi(long objectId) {
        super(objectId);
    }
    public DepositCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theDepositCommandFacade
            .getDepositCommand(this.getId());
    }
    
    public long getClassId() {
        return 122;
    }
    
    public long getAmount() throws PersistenceException {
        return ((PersistentDepositCommand)this.getTheObject()).getAmount();
    }
    public void setAmount(long newValue) throws PersistenceException {
        ((PersistentDepositCommand)this.getTheObject()).setAmount(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentDepositCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentDepositCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentCustomerManager getCommandReceiver() throws PersistenceException {
        return ((PersistentDepositCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentCustomerManager newValue) throws PersistenceException {
        ((PersistentDepositCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentDepositCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentDepositCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentDepositCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentDepositCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentDepositCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentDepositCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleDepositCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDepositCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDepositCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDepositCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleDepositCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDepositCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDepositCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDepositCommand(this);
    }
    public void accept(CustomerManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleDepositCommand(this);
    }
    public <R> R accept(CustomerManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDepositCommand(this);
    }
    public <E extends model.UserException>  void accept(CustomerManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDepositCommand(this);
    }
    public <R, E extends model.UserException> R accept(CustomerManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDepositCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleDepositCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleDepositCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleDepositCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleDepositCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentDepositCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentDepositCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentDepositCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentDepositCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentDepositCommand)this.getTheObject()).sendResult();
    }

    
}
