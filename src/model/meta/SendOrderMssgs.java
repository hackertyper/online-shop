package model.meta;

public interface SendOrderMssgs {
    void accept(SendOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface SendOrderDOWNMssgs extends CustomerOrderStateDOWNMssgs, SendOrderMssgs{}
interface SendOrderUPMssgs extends Mssgs, SendOrderMssgs{}
