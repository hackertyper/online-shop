package persistence;



import model.visitor.*;

public class StartSellingCommandICProxi extends PersistentInCacheProxi implements PersistentStartSellingCommand{
    
    public StartSellingCommandICProxi(long objectId) {
        super(objectId);
    }
    public StartSellingCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theStartSellingCommandFacade
            .getStartSellingCommand(this.getId());
    }
    
    public long getClassId() {
        return 174;
    }
    
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentStartSellingCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentStartSellingCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentNewlyAdded getCommandReceiver() throws PersistenceException {
        return ((PersistentStartSellingCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentNewlyAdded newValue) throws PersistenceException {
        ((PersistentStartSellingCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentStartSellingCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentStartSellingCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentStartSellingCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentStartSellingCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentStartSellingCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentStartSellingCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleStartSellingCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartSellingCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleStartSellingCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartSellingCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleStartSellingCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartSellingCommand(this);
    }
    public void accept(NewlyAddedCommandVisitor visitor) throws PersistenceException {
        visitor.handleStartSellingCommand(this);
    }
    public <R> R accept(NewlyAddedCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStartSellingCommand(this);
    }
    public <E extends model.UserException>  void accept(NewlyAddedCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStartSellingCommand(this);
    }
    public <R, E extends model.UserException> R accept(NewlyAddedCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStartSellingCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentStartSellingCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentStartSellingCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentStartSellingCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentStartSellingCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentStartSellingCommand)this.getTheObject()).sendResult();
    }

    
}
