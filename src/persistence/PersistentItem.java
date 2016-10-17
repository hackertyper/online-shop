package persistence;


public interface PersistentItem extends Anything, AbstractPersistentProxi, Item4Public {
    
    public String getDescription() throws PersistenceException ;
    public void setDescription(String newValue) throws PersistenceException ;
    public abstract PersistentItem getThis() throws PersistenceException ;
    
    

}

