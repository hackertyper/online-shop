package persistence;


public interface PersistentManufacturer extends Anything, SubjInterface, AbstractPersistentProxi, Manufacturer4Public {
    
    public String getName() throws PersistenceException ;
    public void setName(String newValue) throws PersistenceException ;
    public long getManuDelivery() throws PersistenceException ;
    public void setManuDelivery(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentManufacturer getThis() throws PersistenceException ;
    
    

}

