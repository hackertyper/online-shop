package persistence;



import model.visitor.*;

public class ChangeManuDeliveryCommandProxi extends PersistentProxi implements PersistentChangeManuDeliveryCommand{
    
    public ChangeManuDeliveryCommandProxi(long objectId) {
        super(objectId);
    }
    public ChangeManuDeliveryCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 121;
    }
    
    public long getNewManuDelivery() throws PersistenceException {
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).getNewManuDelivery();
    }
    public void setNewManuDelivery(long newValue) throws PersistenceException {
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).setNewManuDelivery(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentArticle getCommandReceiver() throws PersistenceException {
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentArticle newValue) throws PersistenceException {
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public void accept(ArticleCommandVisitor visitor) throws PersistenceException {
        visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R> R accept(ArticleCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    public <E extends model.UserException>  void accept(ArticleCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleChangeManuDeliveryCommand(this);
    }
    public <R, E extends model.UserException> R accept(ArticleCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleChangeManuDeliveryCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentChangeManuDeliveryCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentChangeManuDeliveryCommand)this.getTheObject()).sendResult();
    }

    
}
