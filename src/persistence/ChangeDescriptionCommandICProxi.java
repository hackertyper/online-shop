package persistence;



import model.visitor.*;

public class ChangeDescriptionCommandICProxi extends PersistentInCacheProxi implements PersistentChangeDescriptionCommand{
    
    public ChangeDescriptionCommandICProxi(long objectId) {
        super(objectId);
    }
    public ChangeDescriptionCommandICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theChangeDescriptionCommandFacade
            .getChangeDescriptionCommand(this.getId());
    }
    
    public long getClassId() {
        return 176;
    }
    
    public PersistentItem getItem() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getItem();
    }
    public void setItem(PersistentItem newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setItem(newValue);
    }
    public String getNewDescription() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getNewDescription();
    }
    public void setNewDescription(String newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setNewDescription(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentShopkeeper getCommandReceiver() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentShopkeeper newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeDescriptionCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleChangeDescriptionCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeDescriptionCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangeDescriptionCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeDescriptionCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeDescriptionCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeDescriptionCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public void accept(ShopkeeperCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeDescriptionCommand(this);
    }
    public <R> R accept(ShopkeeperCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeDescriptionCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopkeeperCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeDescriptionCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopkeeperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeDescriptionCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangeDescriptionCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangeDescriptionCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangeDescriptionCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangeDescriptionCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangeDescriptionCommand)this.getTheObject()).sendResult();
    }

    
}
