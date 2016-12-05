package persistence;



import model.visitor.*;

public class RetoureArticleCommandProxi extends PersistentProxi implements PersistentRetoureArticleCommand{
    
    public RetoureArticleCommandProxi(long objectId) {
        super(objectId);
    }
    public RetoureArticleCommandProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 242;
    }
    
    public PersistentQuantifiedArticles getArticle() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentQuantifiedArticles newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setArticle(newValue);
    }
    public long getAmount() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getAmount();
    }
    public void setAmount(long newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setAmount(newValue);
    }
    public Invoker getInvoker() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getInvoker();
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setInvoker(newValue);
    }
    public PersistentOrderManager getCommandReceiver() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getCommandReceiver();
    }
    public void setCommandReceiver(PersistentOrderManager newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setCommandReceiver(newValue);
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getMyCommonDate();
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setMyCommonDate(newValue);
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return ((PersistentRetoureArticleCommand)this.getTheObject()).getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        ((PersistentRetoureArticleCommand)this.getTheObject()).setCommitDate(newValue);
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handleRetoureArticleCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureArticleCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRetoureArticleCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureArticleCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handleRetoureArticleCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureArticleCommand(this);
    }
    public void accept(OrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handleRetoureArticleCommand(this);
    }
    public <R> R accept(OrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoureArticleCommand(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoureArticleCommand(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoureArticleCommand(this);
    }
    
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        ((PersistentRetoureArticleCommand)this.getTheObject()).checkException();
    }
    public void execute() 
				throws PersistenceException{
        ((PersistentRetoureArticleCommand)this.getTheObject()).execute();
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return ((PersistentRetoureArticleCommand)this.getTheObject()).fetchInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentRetoureArticleCommand)this.getTheObject()).sendException(exception);
    }
    public void sendResult() 
				throws PersistenceException{
        ((PersistentRetoureArticleCommand)this.getTheObject()).sendResult();
    }

    
}
