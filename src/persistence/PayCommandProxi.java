package persistence;



import model.visitor.*;

public class PayCommandProxi extends PersistentProxi implements PersistentPayCommand{
    
    public PayCommandProxi(long objectId) {
        super(objectId);
    }
    public PayCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 114;
    }
    
    public long getSum() throws PersistenceException {
        return ((PersistentPayCommand)this.getTheObject()).getSum();
    }
    public void setSum(long newValue) throws PersistenceException {
        ((PersistentPayCommand)this.getTheObject()).setSum(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentPayCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentPayCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentCustomer getCommandReceiver() throws PersistenceException {
        return ((PersistentPayCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentCustomer newValue) throws PersistenceException {
        ((PersistentPayCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentPayCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentPayCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentPayCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentPayCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentPayCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentPayCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handlePayCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePayCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePayCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePayCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePayCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePayCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePayCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePayCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handlePayCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePayCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePayCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePayCommand(this);
    }
    public void accept(CustomerCommandVisitor visitor) throws PersistenceException {
        visitor.handlePayCommand(this);
    }
    public <R> R accept(CustomerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePayCommand(this);
    }
    public <E extends model.UserException>  void accept(CustomerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePayCommand(this);
    }
    public <R, E extends model.UserException> R accept(CustomerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePayCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentPayCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentPayCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentPayCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentPayCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentPayCommand)this.getTheObject()).sendResult();
    }

    
}
