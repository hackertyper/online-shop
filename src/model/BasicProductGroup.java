
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class BasicProductGroup extends model.ProductGroup implements PersistentBasicProductGroup{
    
    private static PersistentBasicProductGroup theBasicProductGroup = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static PersistentBasicProductGroup getTheBasicProductGroup() throws PersistenceException{
        if (theBasicProductGroup == null || reset$For$Test){
            if (reset$For$Test) theBasicProductGroup = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            PersistentBasicProductGroup proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theBasicProductGroupFacade.getTheBasicProductGroup();
                            theBasicProductGroup = proxi;
                            if(proxi.getId() < 0) {
                                ((AbstractPersistentRoot)proxi).setId(proxi.getId() * -1);
                                proxi.initialize(proxi, new java.util.HashMap<String,Object>());
                                proxi.initializeOnCreation();
                            }
                        } catch (PersistenceException e){
                            exception = e;
                        } finally {
                            $$lock.notify();
                        }
                        
                    }
                }
                PersistentBasicProductGroup getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theBasicProductGroup== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theBasicProductGroup;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theBasicProductGroup;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public BasicProductGroup provideCopy() throws PersistenceException{
        BasicProductGroup result = this;
        result = new BasicProductGroup(this.description, 
                                       this.subService, 
                                       this.This, 
                                       this.getId());
        result.itemList = this.itemList.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public BasicProductGroup(String description,SubjInterface subService,PersistentItem This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)description,(SubjInterface)subService,(PersistentItem)This,id);        
    }
    
    static public long getTypeId() {
        return 276;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public PersistentBasicProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentBasicProductGroup result = (PersistentBasicProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentBasicProductGroup)this.This;
    }
    
    public void accept(ProductGroupVisitor visitor) throws PersistenceException {
        visitor.handleBasicProductGroup(this);
    }
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBasicProductGroup(this);
    }
    public void accept(ItemVisitor visitor) throws PersistenceException {
        visitor.handleBasicProductGroup(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBasicProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleBasicProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBasicProductGroup(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleBasicProductGroup(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBasicProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getItemList().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentBasicProductGroup)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
