package persistence;



import model.visitor.*;

public class FindArticleCommandICProxi extends PersistentInCacheProxi implements PersistentFindArticleCommand{
    
    public FindArticleCommandICProxi(long objectId) {
        super(objectId);
    }
    public FindArticleCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theFindArticleCommandFacade
            .getFindArticleCommand(this.getId());
    }
    
    public long getClassId() {
        return 113;
    }
    
    public String getDescription() throws PersistenceException {
        return ((PersistentFindArticleCommand)this.getTheObject()).getDescription();
    }
    public void setDescription(String newValue) throws PersistenceException {
        ((PersistentFindArticleCommand)this.getTheObject()).setDescription(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentFindArticleCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentFindArticleCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentCustomerManager getCommandReceiver() throws PersistenceException {
        return ((PersistentFindArticleCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentCustomerManager newValue) throws PersistenceException {
        ((PersistentFindArticleCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentFindArticleCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentFindArticleCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentFindArticleCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentFindArticleCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentFindArticleCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentFindArticleCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleFindArticleCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFindArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFindArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFindArticleCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleFindArticleCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFindArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFindArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFindArticleCommand(this);
    }
    public void accept(CustomerManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleFindArticleCommand(this);
    }
    public <R> R accept(CustomerManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFindArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CustomerManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFindArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CustomerManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFindArticleCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleFindArticleCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFindArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFindArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFindArticleCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentFindArticleCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentFindArticleCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentFindArticleCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentFindArticleCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentFindArticleCommand)this.getTheObject()).sendResult();
    }

    
}
