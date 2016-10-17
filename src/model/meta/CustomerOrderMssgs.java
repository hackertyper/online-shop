package model.meta;

public interface CustomerOrderMssgs {
    void accept(CustomerOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerOrderDOWNMssgs extends DeliveryDOWNMssgs, CustomerOrderMssgs{}
interface CustomerOrderUPMssgs extends Mssgs, CustomerOrderMssgs{}
