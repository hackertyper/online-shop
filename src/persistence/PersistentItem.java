package persistence;


public interface PersistentItem extends Anything, SubjInterface, AbstractPersistentProxi, Item4Public {
    
    public String getDescription() throws PersistenceException ;
    public void setDescription(String newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentItem getThis() throws PersistenceException ;
    
    
    public PersistentProductGroup getParent() 
				throws PersistenceException;

}

