package model.meta;

public interface CustomerOrderStateMssgs {
    void accept(CustomerOrderStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerOrderStateDOWNMssgs extends Mssgs, CustomerOrderStateMssgs{}
interface CustomerOrderStateUPMssgs extends ArrivedOrderUPMssgs, SendOrderUPMssgs, CustomerOrderStateMssgs{}
