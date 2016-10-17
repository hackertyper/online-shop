package persistence;

import model.*;

public class CustomerServiceFacade{



	public CustomerServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerService newCustomerService(long lowerLimitPreset,long balancePreset,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerService)PersistentProxi.createProxi(idCreateIfLessZero, -103);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CustomerService result = new CustomerService(lowerLimitPreset,balancePreset,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerService)PersistentProxi.createProxi(id, -103);
    }
    
    public PersistentCustomerService newDelayedCustomerService(long lowerLimitPreset,long balancePreset) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CustomerService result = new CustomerService(lowerLimitPreset,balancePreset,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerService)PersistentProxi.createProxi(id, -103);
    }
    
    public CustomerService getCustomerService(long CustomerServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void managerSet(long CustomerServiceId, PersistentCustomer managerVal) throws PersistenceException {
        
    }
    public CustomerServiceSearchList inverseGetManager(long objectId, long classId)throws PersistenceException{
        CustomerServiceSearchList result = new CustomerServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-103);
        while (candidates.hasNext()){
            PersistentCustomerService current = (PersistentCustomerService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getManager() != null){
                if (current.getManager().getClassId() == classId && current.getManager().getId() == objectId) {
                    PersistentCustomerService proxi = (PersistentCustomerService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomerService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

