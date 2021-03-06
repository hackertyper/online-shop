
package model.meta;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class PresetBalanceCommand extends PersistentObject implements PersistentPresetBalanceCommand{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentPresetBalanceCommand getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.getClass(objectId);
        return (PersistentPresetBalanceCommand)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentPresetBalanceCommand createPresetBalanceCommand(long amount,java.sql.Date createDate,java.sql.Date commitDate) throws PersistenceException{
        return createPresetBalanceCommand(amount,createDate,commitDate,false);
    }
    
    public static PersistentPresetBalanceCommand createPresetBalanceCommand(long amount,java.sql.Date createDate,java.sql.Date commitDate,boolean delayed$Persistence) throws PersistenceException {
        PersistentPresetBalanceCommand result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade
                .newDelayedPresetBalanceCommand(amount);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade
                .newPresetBalanceCommand(amount,-1);
        }
        result.setMyCommonDate(CommonDate.createCommonDate(createDate, createDate));
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return true;
    }
    protected long amount;
    protected Invoker invoker;
    protected PersistentShopkeeper commandReceiver;
    protected PersistentCommonDate myCommonDate;
    
    private model.UserException commandException = null;
    
    public PresetBalanceCommand(long amount,Invoker invoker,PersistentShopkeeper commandReceiver,PersistentCommonDate myCommonDate,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.amount = amount;
        this.invoker = invoker;
        this.commandReceiver = commandReceiver;
        this.myCommonDate = myCommonDate;        
    }
    
    static public long getTypeId() {
        return 189;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 189) ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade
            .newPresetBalanceCommand(amount,this.getId());
        super.store();
        if(this.getInvoker() != null){
            this.getInvoker().store();
            ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.invokerSet(this.getId(), getInvoker());
        }
        if(this.getCommandReceiver() != null){
            this.getCommandReceiver().store();
            ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.commandReceiverSet(this.getId(), getCommandReceiver());
        }
        if(this.getMyCommonDate() != null){
            this.getMyCommonDate().store();
            ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.myCommonDateSet(this.getId(), getMyCommonDate());
        }
        
    }
    
    public long getAmount() throws PersistenceException {
        return this.amount;
    }
    public void setAmount(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.amountSet(this.getId(), newValue);
        this.amount = newValue;
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
            ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.invokerSet(this.getId(), newValue);
        }
    }
    public PersistentShopkeeper getCommandReceiver() throws PersistenceException {
        return this.commandReceiver;
    }
    public void setCommandReceiver(PersistentShopkeeper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.commandReceiver)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.commandReceiver = (PersistentShopkeeper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.commandReceiverSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.myCommonDateSet(this.getId(), newValue);
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
        visitor.handlePresetBalanceCommand(this);
    }
    public <R> R accept(CommonDateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePresetBalanceCommand(this);
    }
    public <E extends model.UserException>  void accept(CommonDateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePresetBalanceCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommonDateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePresetBalanceCommand(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePresetBalanceCommand(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePresetBalanceCommand(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePresetBalanceCommand(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePresetBalanceCommand(this);
    }
    public void accept(CommandVisitor visitor) throws PersistenceException {
        visitor.handlePresetBalanceCommand(this);
    }
    public <R> R accept(CommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePresetBalanceCommand(this);
    }
    public <E extends model.UserException>  void accept(CommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePresetBalanceCommand(this);
    }
    public <R, E extends model.UserException> R accept(CommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePresetBalanceCommand(this);
    }
    public void accept(ShopkeeperCommandVisitor visitor) throws PersistenceException {
        visitor.handlePresetBalanceCommand(this);
    }
    public <R> R accept(ShopkeeperCommandReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePresetBalanceCommand(this);
    }
    public <E extends model.UserException>  void accept(ShopkeeperCommandExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePresetBalanceCommand(this);
    }
    public <R, E extends model.UserException> R accept(ShopkeeperCommandReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePresetBalanceCommand(this);
    }
    public int getLeafInfo() throws PersistenceException{
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
        this.commandReceiver.presetBalance(this.getAmount());
		
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
