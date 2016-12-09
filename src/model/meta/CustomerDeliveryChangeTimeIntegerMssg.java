package model.meta;

import persistence.*;

public class CustomerDeliveryChangeTimeIntegerMssg implements CustomerDeliveryDOWNMssgs,CustomerDeliveryUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentCustomerDelivery rcvr;
    public final long newTime;
    
    public CustomerDeliveryChangeTimeIntegerMssg(long newTime,
                                                 persistence.PersistentCustomerDelivery rcvr){
        this.newTime = newTime;
        this.rcvr = rcvr;
    }
    public void accept(CustomerDeliveryMssgsVisitor visitor) throws PersistenceException{
        visitor.handleCustomerDeliveryChangeTimeIntegerMssg(this);
    }
    public void accept(OverNightDeliveryMssgsVisitor visitor) throws PersistenceException{
        visitor.handleCustomerDeliveryChangeTimeIntegerMssg(this);
    }
    public void accept(StandardDeliveryMssgsVisitor visitor) throws PersistenceException{
        visitor.handleCustomerDeliveryChangeTimeIntegerMssg(this);
    }
    public void accept(TestDeliveryMssgsVisitor visitor) throws PersistenceException{
        visitor.handleCustomerDeliveryChangeTimeIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeTimeImplementation(this.newTime);
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
