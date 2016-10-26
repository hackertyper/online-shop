package persistence;



import model.visitor.*;

public class ChangeProductGroupCommandICProxi extends PersistentInCacheProxi implements PersistentChangeProductGroupCommand{
    
    public ChangeProductGroupCommandICProxi(long objectId) {
        super(objectId);
    }
    public ChangeProductGroupCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theChangeProductGroupCommandFacade
            .getChangeProductGroupCommand(this.getId());
    }
    
    public long getClassId() {
        return 125;
    }
    
    public PersistentProductGroup getNewPG() throws PersistenceException {
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).getNewPG();
    }
    public void setNewPG(PersistentProductGroup newValue) throws PersistenceException {
        ((PersistentChangeProductGroupCommand)this.getTheObject()).setNewPG(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangeProductGroupCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentArticle getCommandReceiver() throws PersistenceException {
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentArticle newValue) throws PersistenceException {
        ((PersistentChangeProductGroupCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentChangeProductGroupCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeProductGroupCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeProductGroupCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleChangeProductGroupCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangeProductGroupCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeProductGroupCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public void accept(ArticleCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeProductGroupCommand(this);
    }
    public <R> R accept(ArticleCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeProductGroupCommand(this);
    }
    public <E extends model.UserException>  void accept(ArticleCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeProductGroupCommand(this);
    }
    public <R, E extends model.UserException> R accept(ArticleCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeProductGroupCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangeProductGroupCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangeProductGroupCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangeProductGroupCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangeProductGroupCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangeProductGroupCommand)this.getTheObject()).sendResult();
    }

    
}
