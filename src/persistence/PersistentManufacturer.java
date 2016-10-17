package persistence;


public interface PersistentManufacturer extends Anything, AbstractPersistentProxi, Manufacturer4Public {
    
    public String getName() throws PersistenceException ;
    public void setName(String newValue) throws PersistenceException ;
    public PersistentManufacturer getThis() throws PersistenceException ;
    
    

}

