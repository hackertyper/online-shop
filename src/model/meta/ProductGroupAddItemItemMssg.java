package model.meta;

import persistence.*;

public class ProductGroupAddItemItemMssg implements ProductGroupDOWNMssgs,ProductGroupUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentProductGroup rcvr;
    public final persistence.PersistentItem item;
    
    public ProductGroupAddItemItemMssg(persistence.PersistentItem item,
                                       persistence.PersistentProductGroup rcvr){
        this.item = item;
        this.rcvr = rcvr;
    }
    public void accept(ProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddItemItemMssg(this);
    }
    public void accept(ItemMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddItemItemMssg(this);
    }
    public void accept(BasicProductGroupMssgsVisitor visitor) throws PersistenceException{
        visitor.handleProductGroupAddItemItemMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.addItemImplementation(this.item);
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
