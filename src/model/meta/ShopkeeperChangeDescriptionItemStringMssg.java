package model.meta;

import persistence.*;

public class ShopkeeperChangeDescriptionItemStringMssg implements ShopkeeperDOWNMssgs,ShopkeeperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShopkeeper rcvr;
    public final persistence.PersistentItem item;
    public final String newDescription;
    
    public ShopkeeperChangeDescriptionItemStringMssg(persistence.PersistentItem item,
                                                     String newDescription,
                                                     persistence.PersistentShopkeeper rcvr){
        this.item = item;
        this.newDescription = newDescription;
        this.rcvr = rcvr;
    }
    public void accept(ShopkeeperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopkeeperChangeDescriptionItemStringMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeDescriptionImplementation(this.item, this.newDescription);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
