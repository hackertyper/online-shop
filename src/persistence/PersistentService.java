package persistence;


public interface PersistentService extends Invoker, Anything, Remote, AbstractPersistentProxi, Service4Public {
    
    public long getLowerLimitPreset() throws PersistenceException ;
    public void setLowerLimitPreset(long newValue) throws PersistenceException ;
    public long getBalancePreset() throws PersistenceException ;
    public void setBalancePreset(long newValue) throws PersistenceException ;
    public Service_ErrorsProxi getErrors() throws PersistenceException ;
    public abstract PersistentService getThis() throws PersistenceException ;
    
    

}

