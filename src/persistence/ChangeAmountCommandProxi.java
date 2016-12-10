package persistence;



import model.visitor.*;

public class ChangeAmountCommandProxi extends PersistentProxi implements PersistentChangeAmountCommand{
    
    public ChangeAmountCommandProxi(long objectId) {
        super(objectId);
    }
    public ChangeAmountCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 214;
    }
    
    public PersistentQuantifiedArticles getArticle() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentQuantifiedArticles newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setArticle(newValue);
    }
    public long getNewAmount() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getNewAmount();
    }
    public void setNewAmount(long newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setNewAmount(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentCartManager getCommandReceiver() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangeAmountCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeAmountCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleChangeAmountCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeAmountCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeAmountCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeAmountCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangeAmountCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeAmountCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeAmountCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeAmountCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeAmountCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeAmountCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeAmountCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeAmountCommand(this);
    }
    public void accept(CartManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeAmountCommand(this);
    }
    public <R> R accept(CartManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeAmountCommand(this);
    }
    public <E extends model.UserException>  void accept(CartManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeAmountCommand(this);
    }
    public <R, E extends model.UserException> R accept(CartManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeAmountCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangeAmountCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangeAmountCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangeAmountCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangeAmountCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangeAmountCommand)this.getTheObject()).sendResult();
    }

    
}
