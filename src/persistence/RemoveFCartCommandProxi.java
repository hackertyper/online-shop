package persistence;



import model.visitor.*;

public class RemoveFCartCommandProxi extends PersistentProxi implements PersistentRemoveFCartCommand{
    
    public RemoveFCartCommandProxi(long objectId) {
        super(objectId);
    }
    public RemoveFCartCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 215;
    }
    
    public PersistentQuantifiedArticles getArticle() throws PersistenceException {
        return ((PersistentRemoveFCartCommand)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentQuantifiedArticles newValue) throws PersistenceException {
        ((PersistentRemoveFCartCommand)this.getTheObject()).setArticle(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentRemoveFCartCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentRemoveFCartCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentCartManager getCommandReceiver() throws PersistenceException {
        return ((PersistentRemoveFCartCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentRemoveFCartCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentRemoveFCartCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentRemoveFCartCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentRemoveFCartCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentRemoveFCartCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentRemoveFCartCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentRemoveFCartCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleRemoveFCartCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemoveFCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemoveFCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemoveFCartCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRemoveFCartCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemoveFCartCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemoveFCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemoveFCartCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleRemoveFCartCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemoveFCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemoveFCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemoveFCartCommand(this);
    }
    public void accept(CartManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleRemoveFCartCommand(this);
    }
    public <R> R accept(CartManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemoveFCartCommand(this);
    }
    public <E extends model.UserException>  void accept(CartManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemoveFCartCommand(this);
    }
    public <R, E extends model.UserException> R accept(CartManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemoveFCartCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentRemoveFCartCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentRemoveFCartCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentRemoveFCartCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentRemoveFCartCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentRemoveFCartCommand)this.getTheObject()).sendResult();
    }

    
}
