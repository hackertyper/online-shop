
package model.meta;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class PreorderCommand extends PersistentObject implements PersistentPreorderCommand{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentPreorderCommand getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.getClass(objectId);
        return (PersistentPreorderCommand)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentPreorderCommand createPreorderCommand(java.sql.Date createDate,java.sql.Date commitDate) throws PersistenceException{
        return createPreorderCommand(createDate,commitDate,false);
    }
    
    public static PersistentPreorderCommand createPreorderCommand(java.sql.Date createDate,java.sql.Date commitDate,boolean delayed$Persistence) throws PersistenceException {
        PersistentPreorderCommand result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade
                .newDelayedPreorderCommand();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade
                .newPreorderCommand(-1);
        }
        result.setMyCommonDate(CommonDate.createCommonDate(createDate, createDate));
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return true;
    }
    protected PersistentPreOrder preOrder;
    protected PersistentCustomerDelivery deliveryMethod;
    protected Invoker invoker;
    protected PersistentOrderManager commandReceiver;
    protected PersistentCommonDate myCommonDate;
    
    private model.UserException commandException = null;
    
    public PreorderCommand(PersistentPreOrder preOrder,PersistentCustomerDelivery deliveryMethod,Invoker invoker,PersistentOrderManager commandReceiver,PersistentCommonDate myCommonDate,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.preOrder = preOrder;
        this.deliveryMethod = deliveryMethod;
        this.invoker = invoker;
        this.commandReceiver = commandReceiver;
        this.myCommonDate = myCommonDate;        
    }
    
    static public long getTypeId() {
        return 167;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 167) ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade
            .newPreorderCommand(this.getId());
        super.store();
        if(this.getPreOrder() != null){
            this.getPreOrder().store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.preOrderSet(this.getId(), getPreOrder());
        }
        if(this.getDeliveryMethod() != null){
            this.getDeliveryMethod().store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.deliveryMethodSet(this.getId(), getDeliveryMethod());
        }
        if(this.getInvoker() != null){
            this.getInvoker().store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.invokerSet(this.getId(), getInvoker());
        }
        if(this.getCommandReceiver() != null){
            this.getCommandReceiver().store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.commandReceiverSet(this.getId(), getCommandReceiver());
        }
        if(this.getMyCommonDate() != null){
            this.getMyCommonDate().store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.myCommonDateSet(this.getId(), getMyCommonDate());
        }
        
    }
    
    public PersistentPreOrder getPreOrder() throws PersistenceException {
        return this.preOrder;
    }
    public void setPreOrder(PersistentPreOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.preOrder)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.preOrder = (PersistentPreOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.preOrderSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerDelivery getDeliveryMethod() throws PersistenceException {
        return this.deliveryMethod;
    }
    public void setDeliveryMethod(PersistentCustomerDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.deliveryMethod)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.deliveryMethod = (PersistentCustomerDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.deliveryMethodSet(this.getId(), newValue);
        }
    }
    public Invoker getInvoker() throws PersistenceException {
        return this.invoker;
    }
    public void setInvoker(Invoker newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.invoker)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.invoker = (Invoker)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.invokerSet(this.getId(), newValue);
        }
    }
    public PersistentOrderManager getCommandReceiver() throws PersistenceException {
        return this.commandReceiver;
    }
    public void setCommandReceiver(PersistentOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.commandReceiver)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.commandReceiver = (PersistentOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.commandReceiverSet(this.getId(), newValue);
        }
    }
    public PersistentCommonDate getMyCommonDate() throws PersistenceException {
        return this.myCommonDate;
    }
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myCommonDate)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myCommonDate = (PersistentCommonDate)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreorderCommandFacade.myCommonDateSet(this.getId(), newValue);
        }
    }
    public java.sql.Date getCreateDate() throws PersistenceException {
        return this.getMyCommonDate().getCreateDate();
    }
    public void setCreateDate(java.sql.Date newValue) throws PersistenceException {
        this.getMyCommonDate().setCreateDate(newValue);
    }
    public java.sql.Date getCommitDate() throws PersistenceException {
        return this.getMyCommonDate().getCommitDate();
    }
    public void setCommitDate(java.sql.Date newValue) throws PersistenceException {
        this.getMyCommonDate().setCommitDate(newValue);
    }
    public void delete$Me() throws PersistenceException{
        super.delete$Me();
        this.getMyCommonDate().delete$Me();
    }
    
    public void accept(CommonDateVisitor visitor) throws PersistenceException {
        visitor.handlePreorderCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreorderCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreorderCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreorderCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handlePreorderCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreorderCommand(this);
    }
    public void accept(OrderManagerCommandVisitor visitor) throws PersistenceException {
        visitor.handlePreorderCommand(this);
    }
    public <R> R accept(OrderManagerCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreorderCommand(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreorderCommand(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreorderCommand(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getPreOrder() != null) return 1;
        if (this.getDeliveryMethod() != null) return 1;
        if (this.getCommandReceiver() != null) return 1;
        return 0;
    }
    
    
    
    
    // Start of section that contains operations that must be implemented.
    
    public void checkException() 
				throws model.UserException, PersistenceException{
        if (this.commandException != null) throw this.commandException;
    }
    public void execute() 
				throws PersistenceException{
        try{
			this.commandReceiver.preorder(this.getPreOrder(), this.getDeliveryMethod());
		}
		catch(model.InsufficientFunds e){
			this.commandException = e;
		}
    }
    public Invoker fetchInvoker() 
				throws PersistenceException{
        return this.getInvoker();
    }
    public void sendException(final PersistenceException exception) 
				throws PersistenceException{
        this.invoker.handleException(this, exception);
    }
    public void sendResult() 
				throws PersistenceException{
        this.invoker.handleResult(this);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
