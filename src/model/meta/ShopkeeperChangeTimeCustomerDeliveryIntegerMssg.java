package model.meta;

import persistence.*;

public class ShopkeeperChangeTimeCustomerDeliveryIntegerMssg implements ShopkeeperDOWNMssgs,ShopkeeperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShopkeeper rcvr;
    public final persistence.PersistentCustomerDelivery cd;
    public final long newTime;
    
    public ShopkeeperChangeTimeCustomerDeliveryIntegerMssg(persistence.PersistentCustomerDelivery cd,
                                                           long newTime,
                                                           persistence.PersistentShopkeeper rcvr){
        this.cd = cd;
        this.newTime = newTime;
        this.rcvr = rcvr;
    }
    public void accept(ShopkeeperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopkeeperChangeTimeCustomerDeliveryIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeTimeImplementation(this.cd, this.newTime);
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
